package com.zyl.award.business.user.web;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @desc:
 * @author: create by SunHJ
 * @date:2018/8/10 13:29
 */
@RestController
public class TestController {
    @Autowired
    RestTemplate restTemplate;

    @ApiOperation(value = "测试", notes = "测试")
    @GetMapping("/json")
    public Object genJson(){
//        String url = "http://ip.taobao.com/service/getIpInfo.php?ip=192.168.2.107";
        String url = "https://pmarketing.jgrcb.com/api/customers";
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, null,String.class);
        return responseEntity.getBody();
    }
}
