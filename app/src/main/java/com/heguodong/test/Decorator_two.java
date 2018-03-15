package com.heguodong.test;

import android.util.Log;

/**
 * Created by 何国栋 on 2018/3/15.
 * 3.3 定义第三种装饰
 */

public class Decorator_two extends Decorator {

    public Decorator_two(Human human) {
        super(human);
    }

    public void findClothes(){
        Log.i("heguodong","找到一件优衣库。");
    }

    public void findTheTarget(){
        Log.i("heguodong","找到朱自清的《背影》。");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        findClothes();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findTheTarget();
    }
}
