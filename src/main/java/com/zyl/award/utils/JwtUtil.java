package com.zyl.award.utils;


import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;
import com.zyl.award.enums.ResultCode;
import com.zyl.award.exception.BusinessException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtUtil {


    /**
     * token秘钥，请勿泄露
     */
    private static final String SECRET = "zyl2019";
    /**
     * token 过期时间: 1天
     */
    private static final int MAX_AGE = 1;

    private static final String USER_ID = "userId";

    /**
     * JWT生成Token.
     * JWT构成: header, payload, signature
     *
     * @param userId 登录成功后用户user_id, 参数user_id不可传空
     */
    public static String createToken(Integer userId) {
        Date iatDate = new Date();
        // expire time
        Calendar nowTime = Calendar.getInstance();
        nowTime.add(Calendar.DATE, MAX_AGE);
        Date expiresDate = nowTime.getTime();

        // header Map
        Map<String, Object> map = new HashMap<>();
        map.put("alg", "HS256");
        map.put("typ", "JWT");

        String token = JWT.create().withHeader(map)
                .withClaim("iss", "Service")
                .withAudience("APP")
                .withIssuer("SERVICE")
                .withClaim(USER_ID, null == userId ? null : userId.toString())
                .withIssuedAt(iatDate)
                .withExpiresAt(expiresDate)
                .sign(Algorithm.HMAC256(SECRET));

        return token;
    }

    /**
     * 解密Token
     *
     * @param token
     * @return
     * @throws Exception
     */
    public static Map<String, Claim> verifyToken(String token) {
        DecodedJWT jwt = null;
        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SECRET)).build();
            jwt = verifier.verify(token);
        } catch (Exception e) {
           throw new BusinessException(ResultCode.TOKEN_ERROR);
        }
        return jwt.getClaims();
    }

    /**
     * 根据Token获取user_id
     *
     * @param token
     * @return user_id
     */
    public static Integer getAppUID(String token) {
        Map<String, Claim> claims = verifyToken(token);
        Claim userIdClaim = claims.get(USER_ID);
        if (null == userIdClaim || StringUtils.isEmpty(userIdClaim.asString())) {
            throw new BusinessException(ResultCode.TOKEN_ERROR);
        }
        return Integer.valueOf(userIdClaim.asString());
    }


}