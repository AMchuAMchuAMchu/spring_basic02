package com.itheima.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_basic02
 * BelongsPackage ==> com.itheima.pojo
 * Version ==> 1.0
 * CreateTime ==> 2022-10-02 14:44:57
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Component
@Data
public class AnimeInfo {

    private String name;

    private Integer releaseTime;

    private String character01;

    private String character02;
}
