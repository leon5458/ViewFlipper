package com.hly.viewflipper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    private ViewFlipper vf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vf = findViewById(R.id.viewfilpper);

        for (int i = 0; i < 5; i++) {
            View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.viewfilpper_item_layout, null);
            vf.addView(view);
        }

    }
}
