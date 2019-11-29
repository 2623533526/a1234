package com.bawei.a123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("这是主分支");
        System.out.println("这是子分支的消息");
        System.out.println("1111111111111111111111");
    }
}
