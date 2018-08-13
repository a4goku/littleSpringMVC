package com.milCheck.service;

import com.milCheck.model.SeeUser;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component("seeUserRedisTakes")
public class SeeUserRedisTakes implements RedisBaiseTakes<String,String,SeeUser>{
    @Resource(name="redisTemplate")
    private RedisTemplate redisTemplate;

    @Override
    public void add(String key, String value) {
        if(redisTemplate==null){
            return;
        }else{
            redisTemplate.opsForValue().set(key,value);
        }
    }

    @Override
    public void addObj(String objectKey, String key, SeeUser object) {
        if(redisTemplate==null){
            return;
        }else{
            redisTemplate.opsForHash().put(objectKey,key,object);
        }
    }

    @Override
    public void delete(String key) {

    }

    @Override
    public void delete(List<String> listKeys) {

    }

    @Override
    public void deletObj(String objecyKey, String key) {

    }

    @Override
    public void update(String key, String value) {

    }

    @Override
    public void updateObj(String objectKey, String key, SeeUser object) {

    }

    @Override
    public String get(String key) {
        String value = (String) redisTemplate.opsForValue().get(key);
        return value;
    }

    @Override
    public SeeUser getObj(String objectKey, String key) {
        SeeUser seeUser = (SeeUser) redisTemplate.opsForHash().get(objectKey,key);
        return seeUser;
    }
}
