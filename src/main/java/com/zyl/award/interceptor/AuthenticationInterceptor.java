package com.zyl.award.interceptor;

import com.zyl.award.enums.ResultCode;
import com.zyl.award.exception.BusinessException;
import com.zyl.award.utils.JwtUtil;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @author sunhaijun
 * @description: 权限拦截
 * @create: 2019-06-29 09:12
 **/
@Component
public class AuthenticationInterceptor extends HandlerInterceptorAdapter {

    private static final String AUTHORIZATION = "token";

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object) throws Exception {
        // 从 http 请求头中取出 token
        // 如果不是映射到方法直接通过
        String token = httpServletRequest.getHeader(AUTHORIZATION);
        if (!(object instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) object;
        Method method = handlerMethod.getMethod();
        // 执行认证
        if (token == null) {
            throw new BusinessException(ResultCode.TOKEN_ERROR);
        }
        // 获取 token 中的 demo id
        Integer userId = JwtUtil.getAppUID(token);
        if(ObjectUtils.isEmpty(userId)){
            throw new BusinessException(ResultCode.TOKEN_ERROR);
        }
        return super.preHandle(httpServletRequest,httpServletResponse,object);
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest,
                           HttpServletResponse httpServletResponse,
                           Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse,
                                Object o, Exception e) throws Exception {
    }
}
