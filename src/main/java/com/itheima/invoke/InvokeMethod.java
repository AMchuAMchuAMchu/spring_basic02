package com.itheima.invoke;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_basic02
 * BelongsPackage ==> com.itheima.invoke
 * Version ==> 1.0
 * CreateTime ==> 2022-10-02 15:11:15
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Component
@Aspect
public class InvokeMethod {
//
//    @Pointcut("execution(public void com.itheima.dao.impl.AnimeListImpl.printAnimeListInfo())")
//    public void pt01(){}

    @Pointcut("execution(public void com.itheima.dao.AnimeList.printAnimeListInfo())")
    public void pt01(){}

//    public InvokeMethod() {
//        System.out.println(">>>我是通知对象");
//    }

    @Before("pt01()")
    public void DateTimeInvoke(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String format = dateTimeFormatter.format(now);
        System.out.println(format);
    }
//
//
//    @Before("pt01()")
//    public void DateTimeInvoke(){
//        LocalDateTime now = LocalDateTime.now();
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
//        String format = dateTimeFormatter.format(now);
//        System.out.println(format);
//    }

//    @After("pt01()")
//    public void DateTimeInvoke(){
//        LocalDateTime now = LocalDateTime.now();
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
//        String format = dateTimeFormatter.format(now);
//        System.out.println(format);
//    }




}
