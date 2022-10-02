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

        animeList.add("");
    }
}
