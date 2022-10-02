package com.itheima.dao.impl;

import com.itheima.dao.AnimeList;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_basic02
 * BelongsPackage ==> com.itheima.dao.impl
 * Version ==> 1.0
 * CreateTime ==> 2022-10-02 14:40:29
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Component
public class AnimeListImpl implements AnimeList {

    @Override
    public void printAnimeListInfo() {
        ArrayList<String> animeList = new ArrayList<>();
        animeList.add("01 影宅");
        animeList.add("02 Lycoris Recoil");
        animeList.add("03 契约之吻");
        animeList.add("04 彻夜之歌");
        animeList.forEach(System.out::println);
    }

    @Override
    public Object getAnimeList() {
        ArrayList<String> animeList = new ArrayList<>();
        animeList.add("01 SAO");
        animeList.add("02 刀剑神域");
        animeList.add("03 ALO");
        animeList.add("04 GGO");
        animeList.forEach(System.out::println);
//        int i  = 10/0;
        return animeList;
    }

    @Override
    public void sayHello() {
        System.out.println("扣你吃哇...-_-!!");
    }
}
