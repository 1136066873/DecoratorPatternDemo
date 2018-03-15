package com.heguodong.test;

import android.util.Log;

/**
 * Created by 何国栋 on 2018/3/15.
 * 4 定义被装饰者，这个被装饰者初始状态有些自己的装饰
 */

public class Person implements Human {


    @Override
    public void wearClothes() {
        Log.i("heguodong","今天穿什么呢？");
    }

    @Override
    public void walkToWhere() {
        Log.i("heguodong","我一会儿要去干嘛呢？");
    }
}
