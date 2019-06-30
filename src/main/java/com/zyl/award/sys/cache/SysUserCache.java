package com.zyl.award.sys.cache;

import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.zyl.award.commons.cache.BaseGuavaCache;
import com.zyl.award.sys.entity.vo.SysUserVo;
import com.zyl.award.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sunhaijun
 * @description: 用户缓存
 * @create: 2019-06-30 10:12
 **/
@Component
public class SysUserCache extends BaseGuavaCache<Integer, SysUserVo> {

    @Autowired
    SysUserService sysUserService;

    @Override
    public LoadingCache<Integer, SysUserVo> constructCache() {
        cache = getCacheBuilder().build(new CacheLoader<Integer, SysUserVo>() {
            @Override
            public SysUserVo load(Integer sysUserId) {
                //为null时，会抛出异常
                return loadValueWhenNotExists(sysUserId);
            }

        });
        return cache;
    }

    @Override
    public SysUserVo loadValueWhenNotExists(Integer key) {
        return new SysUserVo();
    }

    @Override
    protected SysUserVo getValueWhenExpired(Integer key)  {
        return new SysUserVo();
    }
}
