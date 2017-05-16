package ua.training.dao;

import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Locale;

/**
 * Created by Payuk on 14.03.2017.
 */
@Component
public class RedisDAO {
    Jedis connect;

    public RedisDAO(){
        ResourceBundleMessageSource bean = new ResourceBundleMessageSource();
        bean.setBasename("db");
        connect = new Jedis(bean.getMessage("db.jedisurl", null, Locale.ENGLISH));
    }
    public List<String> getAllBroadcastMessages(){
        return connect.lrange("broadcast", 0, -1);
    }
    public void saveMessage(String login, String message){
        connect.lpush("broadcast", login + ":" + message);
    }
}
