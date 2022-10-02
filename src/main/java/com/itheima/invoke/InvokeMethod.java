package com.itheima.invoke;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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

    @Pointcut("execution(* com.itheima.*.*.getAnimeList(..))")
    public void pt01(){}

//    public InvokeMethod() {
//        System.out.println(">>>我是通知对象");
//    }


    @Around("pt01()")
    public Object DateTimeInvoke(ProceedingJoinPoint joinPoint) throws Throwable {
        LocalDateTime now01 = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter01 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String format01 = dateTimeFormatter01.format(now01);
        System.out.println(format01);

        Object proceed = joinPoint.proceed();

        LocalDateTime now02 = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter02 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String format02 = dateTimeFormatter02.format(now02);
        System.out.println(format02);

        return "-_-!!";
    }






//    @AfterReturning("pt01()")
//    public void DateTimeInvoke(){
//        LocalDateTime now = LocalDateTime.now();
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
//        String format = dateTimeFormatter.format(now);
//        System.out.println(format);
//    }
//
//
//
//    @AfterThrowing("pt01()")
//    public void DateTimeInvoke(){
//        LocalDateTime now = LocalDateTime.now();
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
//        String format = dateTimeFormatter.format(now);
//        System.out.println(format);
//    }


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
