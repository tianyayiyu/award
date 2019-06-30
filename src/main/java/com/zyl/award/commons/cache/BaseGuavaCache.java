package com.zyl.award.commons.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.RemovalNotification;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author sunhaijun
 * @description: 基于Guava的cache
 * @create: 2019-06-30 08:36
 **/
@Slf4j
public abstract class BaseGuavaCache<K, V> {

    /**
     * 缓存自动刷新周期
     */
    protected int refreshDuration = -1;
    /**
     * 缓存自动刷新周期时间格式
     */
    protected TimeUnit refreshTimeUnit = TimeUnit.MINUTES;

    /**
     * 缓存过期周期（负数代表永不过期）
     */
    protected int expirationDuration = -1;
    /**
     * 缓存过期周期时间格式
     */
    protected TimeUnit expirationTimeUnit = TimeUnit.MINUTES;
    /**
     * 缓存最大容量
     */
    protected int maxSize = 200;

    /**
     * 初始化容量
     */
    protected int initialCapacity = 20;

    /**
     * 记录命中率
     */
    protected boolean isRecordStats = false;

    protected LoadingCache<K, V> cache;

    /**
     * 子类初始化缓存构造
     *
     * @return
     */
    public abstract LoadingCache<K, V> constructCache();

    public BaseGuavaCache() {
        constructCache();
    }

    /**
     * 实现了一个CacheBuilder
     *
     * @return
     */
    protected CacheBuilder<Object, Object> getCacheBuilder() {

        CacheBuilder<Object, Object> cacheBuilder =
                CacheBuilder.newBuilder()
                        .maximumSize(maxSize)
                        .initialCapacity(initialCapacity);
        if (isRecordStats) {
            cacheBuilder.recordStats();
        }
        //设置缓存刷新周期
        if (refreshDuration > 0) {
            cacheBuilder.refreshAfterWrite(refreshDuration, refreshTimeUnit);
        }
        //设置缓存过期周期
        if (expirationDuration > 0) {
            cacheBuilder.expireAfterWrite(expirationDuration, expirationTimeUnit);
        }
        cacheBuilder = cacheBuilder.removalListener(this::removalListener);
        return cacheBuilder;
    }

    /**
     * 当key不存在的时候
     */
    public abstract V loadValueWhenNotExists(K k);

    /**
     * 监听cache中删除Key的时间
     */
    protected void removalListener(RemovalNotification removalNotification) {
        if (log.isDebugEnabled()) {
            log.debug(this.getClass().getSimpleName() + "删除元素，Key{},Value:{}", removalNotification.getKey(), removalNotification.getValue().toString());
        }
    }

    /**
     * @param key 缓存的key
     * @return 缓存值
     * @throws Exception 异常
     */
    protected abstract V getValueWhenExpired(K key) throws Exception;

    /**
     * 从cache中取数据
     *
     * @param key 键
     * @return 值
     */
    public V getValue(K key)  {
        try {
            return cache.get(key);
        } catch (ExecutionException e) {
            log.error("缓存获取异常，key:{}", key, e);
            return null;
        }
    }

    /**
     * 从cache中取数据，若发生异常，则返回默认值
     *
     * @param key 键
     * @return 值
     * @throws ExecutionException 异常
     */
    public V getValueOfDefault(K key, V defaultValue) {
        try {
            return cache.get(key);
        } catch (ExecutionException | CacheLoader.InvalidCacheLoadException e) {
            log.error("缓存中无此数据，key:{}", key, e);
            return defaultValue;
        }
    }

    /**
     * 注意此处执行put的时候，是删除原先的值存入新的，会调用删除的监听器
     *
     * @param key
     * @param value
     */
    public void put(K key, V value) {
        cache.put(key, value);
    }

    /**
     * 清除所有缓存
     */
    public void clearAllCache() {
        cache.invalidateAll();
    }

    /**
     * 清除指定缓存
     */
    public void clearCacheByKey(K key) {
        cache.invalidate(key);
    }

    public V clearGetCacheByKey(K key) {
        V v = null;
        try {
            v = cache.get(key);
            cache.invalidate(key);
        } catch (ExecutionException e) {
            log.error("cache获取删除异常->",e);
        }
        return v;
    }

}

