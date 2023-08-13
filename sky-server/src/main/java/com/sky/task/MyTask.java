package com.sky.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author kwh
 * @version 1.0
 * 2023.08.11
 */
@Component
@Slf4j
public class MyTask {


    /**
     * 每隔5秒触发
     */
    //@Scheduled(cron = "0/5 * * * * ?")
    public void testTask(){
        log.info("初次测试定时任务执行: {}",new Date());
    }
}
