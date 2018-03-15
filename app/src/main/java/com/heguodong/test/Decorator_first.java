package com.heguodong.test;

import android.util.Log;

/**
 * Created by 何国栋 on 2018/3/15.
 * 3.2 定义第二种装饰
 */

public class Decorator_first extends Decorator {

    public Decorator_first(Human human) {
        super(human);
    }

    public void goClothespress(){
        Log.i("heguodong","去衣柜找找看。");
    }

    public void findWordsOnBook(){
        Log.i("heguodong","在书上找找好看的文章。");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goClothespress();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findWordsOnBook();
    }
}
