package com.heguodong.test;

/**
 * Created by 何国栋 on 2018/3/15.
 * 2 定义装饰者
 */

public abstract class Decorator implements Human {

    private Human human;

    public Decorator(Human human) {
        this.human = human;
    }

    public void wearClothes() {
        human.wearClothes();
    }

    public void walkToWhere() {
        human.walkToWhere();
    }

}
