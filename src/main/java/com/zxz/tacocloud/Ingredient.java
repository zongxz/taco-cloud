package com.zxz.tacocloud;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author zxz
 * @date 2021/3/16 17:00
 */
@Data
@RequiredArgsConstructor
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;


    public static enum Type {
        /**
         * 配料分类
         * 蛋白质，奶酪，酱汁等
         */
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
