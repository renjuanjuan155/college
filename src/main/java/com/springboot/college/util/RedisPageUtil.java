package com.springboot.college.util;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.SortParameters;
import org.springframework.data.redis.core.*;
import org.springframework.data.redis.core.query.SortQueryBuilder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Description TODO
 * @Date 2019/12/26 10:29
 * @Created by yuyanfeng
 */
@Component
public class RedisPageUtil {

    @Autowired
    private StringRedisTemplate redisTemplate;

    public ValueOperations<String, String> string;
    public HashOperations<String, String, String> hash;
    public ListOperations<String, String> list;
    public SetOperations<String, String> set;
    public ZSetOperations<String, String> zSet;

    public RedisPageUtil(StringRedisTemplate stringRedisTemplate) {
        this.redisTemplate = stringRedisTemplate;
        string = redisTemplate.opsForValue();
        hash = redisTemplate.opsForHash();
        list = redisTemplate.opsForList();
        set = redisTemplate.opsForSet();
        zSet = redisTemplate.opsForZSet();
    }

    /**
     * 通过redis管道批量插入数据
     * @param key
     * @param entitys
     * @param leftKey
     * @param <T>
     */
    public <T> void batchHashSet(String key, List<T> entitys, String leftKey) {
        redisTemplate.executePipelined(new SessionCallback<Object>() {
            @Override
            public <K, V> Object execute(RedisOperations<K, V> redisOperations) throws DataAccessException {
                hashSetList(key, entitys, leftKey);
                return null;
            }
        });
    }

    /**
     * 按Hash添加实体
     *
     * @param key     集合key
     * @param id      标识id
     * @param entity  存储对象
     * @param leftKey 左外关联key
     * @param <T>
     */
    public <T> void hashSet(String key, String id, Map<String, String> entity, String leftKey) {
        for (String mapKey : entity.keySet()) {
            entity.put(mapKey, String.valueOf(entity.get(mapKey)));
        }
        hash.putAll(key + ":" + id, entity);
        list.leftPush(leftKey, id);
    }

    /**
     * 按Hash添加实体集合
     *
     * @param key     集合key
     * @param entitys 传输的对象集合
     * @param leftKey 左外关联key
     */
    public <T> void hashSetList(String key, List<T> entitys, String leftKey) {
        deleteByPrex(key);
        List<Map> list = JSONObject.parseArray(JSONObject.toJSONString(entitys), Map.class);
        int i = 0;
        for (Map t : list) {
            hashSet(key, String.valueOf(i), t, leftKey);
            i++;
        }
    }

    /**
     * 根据key和ID获取对象
     *
     * @param key 集合key
     * @param id  集合对象对应ID
     * @return
     */
    public Map<String, String> hashGet(String key, String id) {
        Map<String, String> entries = hash.entries(key + ":" + id);
        return entries;
    }


    /**
     * 分页查询无排序
     *
     * @param key      集合key
     * @param leftKey  左外关联idkey
     * @param currPage 当前页
     * @param limit    一页几条
     * @return
     */
    public List<Map<String, String>> pageSort(String key, String leftKey, int currPage, int limit) {
        int offset = currPage * limit;
        List<Map<String, String>> pageList = new ArrayList<>();
        List<String> list = hashGetIds(leftKey, offset, limit);
        for (String string : list) {
            pageList.add(hashGet(key, string));
        }
        return pageList;
    }
    /**
     * 获取ids无排序
     *
     * @param leftKey 左外关联idkey
     * @param offset  开始条
     * @param limit   一页几条
     * @return
     */
    public List<String> hashGetIds(String leftKey, int offset, int limit) {
        List<String> list = new ArrayList<>();
        list = redisTemplate.sort(
                SortQueryBuilder
                        .sort(leftKey)
                        .limit(offset, limit)
                        .build()
        );
        return list;
    }

    /**
     * 获取ids分页降序
     *
     * @param key     集合key
     * @param leftKey 左外关联key
     * @param pattern 需要排序的字段
     * @param offset  开始条数
     * @param limit   一页几条
     * @return
     */
    public List<Map<String, String>> hashGetIdsOrderDESC(String key, String leftKey, String pattern, int offset, int limit) {
        pattern = key + ":*->" + pattern;
        List<String> list = new ArrayList<>();
        List<Map<String, String>> pageList = new ArrayList<>();
        list = redisTemplate.sort(
                SortQueryBuilder
                        .sort(leftKey)
                        .by(pattern)
                        .alphabetical(false)
                        .order(SortParameters.Order.DESC)
                        .limit(offset, limit)
                        .build()
        );
        for (String string : list) {
            pageList.add(hashGet(key, string));
        }
        return pageList;
    }

    /**
     * 获取ids分页升序
     *
     * @param key     集合key
     * @param leftKey 左外关联key
     * @param pattern 排序字段
     * @param offset  开始条数
     * @param limit   一页几条
     * @return
     */
    public List<Map<String, String>> hashGetIdsOrderASC(String key, String leftKey, String pattern, int offset, int limit) {
        List<String> list = new ArrayList<>();
        List<Map<String, String>> pageList = new ArrayList<>();
        pattern = key + ":*->" + pattern;
        list = redisTemplate.sort(
                SortQueryBuilder
                        .sort(leftKey)
                        .by(pattern)
                        .alphabetical(false)
                        .order(SortParameters.Order.ASC)
                        .limit(offset, limit)
                        .build()
        );
        for (String string : list) {
            pageList.add(hashGet(key, string));
        }
        return pageList;
    }

    /**
     * 模糊删除redis中的key匹配格式key:*
     *
     * @param prex
     */
    public void deleteByPrex(String prex) {
        redisTemplate.delete(prex + "ids");
        Set<String> keys = redisTemplate.keys(prex + ":*");
        if (!keys.isEmpty()) {
            redisTemplate.delete(keys);
        }
    }
}
