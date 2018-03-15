package com.heguodong.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


/**
 *
 * http://blog.csdn.net/jason0539/article/details/22713711
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        tv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv :
                test();
                break;
        }
    }

    private void test() {
        Human person  = new Person();
        Decorator decorator = new Decorator_two(new Decorator_first(new Decorator_zero(person)));
        decorator.wearClothes();
        decorator.walkToWhere();
    }
}
