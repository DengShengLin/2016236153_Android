package com.hstc.cs.shad.prj06;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static final int UPDATE_TEXT = 1;
    private TextView text;
    private int count;

    @SuppressLint("HandlerLeak")
    private Handler handler = new Handler() {
        @SuppressLint("SetTextI18n")
        public void handleMessage(Message msg) {
            if (msg.what == UPDATE_TEXT) {
                count++;
                text.setText("当前数字为：" + count);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        Button counter = findViewById(R.id.button);
        counter.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Timer timer = new Timer();
                    TimerTask task = new TimerTask() {
                        @Override
                        public void run() {
                            Message message = new Message();
                            message.what = UPDATE_TEXT;
                            handler.sendMessage(message);
                        }
                    };
//                    schedule(task, delay,period)
//                    作用：在等待delay 0毫秒后首次执行task，每隔period 100毫秒重复执行task
                    timer.schedule(task, 0, 100);
                    try {
//                        Thread.Sleep()方法用于将当前线程暂停一定时间，时间单位是毫秒，1000毫秒= 1秒。
                        Thread.sleep(2000);
                        timer.cancel();
                    } catch (InterruptedException ignored) {
                    }
                }
            }).start();
        }
    }
}
