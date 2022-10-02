package com.itheima.test;

import com.itheima.cfg.SpringConfig;
import com.itheima.dao.AnimeList;
import com.itheima.dao.impl.AnimeListImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_basic02
 * BelongsPackage ==> com.itheima.test
 * Version ==> 1.0
 * CreateTime ==> 2022-10-02 14:58:16
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class TestAOP {

    public AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);



    @Test
    public void test01(){

        AnimeList bean = ac.getBean(AnimeList.class);
        bean.printAnimeListInfo();
        bean.sayHello();
//        System.out.println(bean);
//        System.out.println(bean.getClass());


    }


}
