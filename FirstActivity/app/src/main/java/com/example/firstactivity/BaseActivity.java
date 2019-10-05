package com.example.firstactivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BaseActivity",  "This is " + getClass().getSimpleName() + " Activity is onCreate!!");
        ActivityCollector.addActivity(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BaseActivity",  getClass().getSimpleName() + "Activity is onDestroy!!");
        ActivityCollector.removeActivity(this);
    }
}
