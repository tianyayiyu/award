package com.zyl.award.business.demo.service.impl;

import com.zyl.award.business.demo.entity.UserInfo;
import com.zyl.award.business.demo.service.UserService;
import com.zyl.award.commons.service.impl.BaseMySqlBaseCrudServiceImpl;
import com.zyl.award.exception.BusinessException;
import com.zyl.award.manager.ThreadPoolManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @desc:
 * @author: create by SunHJ
 * @date:2018/7/6 13:36
 */
@Service
@Slf4j
public class UserServiceImpl extends BaseMySqlBaseCrudServiceImpl<UserInfo, Integer> implements UserService {

    @Autowired
    ThreadPoolManager threadPoolManager;

    @Override
    @Transactional
    public UserInfo registerService(UserInfo userInfo) {
        String success = "";
        Future<String> future = threadPoolManager.submit(new RegisterCall("send"));
        System.out.println("多线程执行...");
        try {
            success = future.get();
        }catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        UserInfo userInfo1 = null;
        if(success.equals("success")){
            Integer id = insert(userInfo);
            userInfo1 = selectByPk(id);
        }
        return userInfo1;
    }

}
class RegisterCall implements Callable<String>{
    public String request="";
    public RegisterCall(String request) {
            this.request = request;
    }

    @Override
    public String call() throws Exception {
        request=request+"success";
        throw new BusinessException("注册失败");
//        return request;
    }
}
