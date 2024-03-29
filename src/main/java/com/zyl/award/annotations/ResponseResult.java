package com.zyl.award.annotations;


import com.zyl.award.result.PlatformResult;
import com.zyl.award.result.Result;

import java.lang.annotation.*;

/**
 * @desc 接口返回结果增强  会通过拦截器拦截后放入标记，在WebResponseBodyHandler进行结果处理
 *
 * @author shj
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ResponseResult {

    Class<? extends Result>  value() default PlatformResult.class;

}
