package com.sky;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.util.DigestUtils;

@SpringBootApplication
@EnableTransactionManagement //开启注解方式的事务管理
@Slf4j
@EnableCaching//开启缓存注解
public class SkyApplication {

    /*
     * 解决druid 日志报错：discard long time none received connection:xxx
     * */
    static {
        System.setProperty("druid.mysql.usePingMethod","false");
    }

    public static void main(String[] args) {
//        String s = DigestUtils.md5DigestAsHex("123456".getBytes());
//        log.info(s);
        SpringApplication.run(SkyApplication.class, args);
        log.info("server started");
    }

}
