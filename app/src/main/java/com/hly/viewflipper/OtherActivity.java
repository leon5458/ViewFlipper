package com.hly.viewflipper;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ViewFlipper;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/8/17~~~~~~
 * ~~~~~~更改时间:2018/8/17~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class OtherActivity extends AppCompatActivity {
    private ViewFlipper vf;

    private ViewFlipper hor_vf;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other_activity_layout);
        vf = findViewById(R.id.viewfilpper);
        for (int i = 0; i < 5; i++) {
            View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.other_viewfilpper_item_layout, null);
            vf.addView(view);
        }

        hor_vf = findViewById(R.id.viewfilpper1);
        for (int i = 0; i < 5; i++) {
            View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.other_viewfilpper_item_layout, null);
            hor_vf.addView(view);
        }

    }
}
