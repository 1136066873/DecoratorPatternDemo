package com.heguodong.test;

import android.util.Log;

/**
 * Created by 何国栋 on 2018/3/15.
 * 3.1 定义第一种装饰
 */

public class Decorator_zero extends Decorator {

    public Decorator_zero(Human human){
        super(human);
    }

    public void goHome(){
        Log.i("heguodong","回到家。");
    }

    public void findBook(){
        Log.i("heguodong","去书房找书。");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goHome();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findBook();
    }
}
