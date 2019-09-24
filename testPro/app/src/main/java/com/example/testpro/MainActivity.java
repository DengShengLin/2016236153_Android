package com.example.testpro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     *
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //得到MenuInflater对象后调用inflate()方法创建菜单
        getMenuInflater().inflate(R.menu.main, menu);
        //参数1 哪个资源文件 参数2 添加到哪个对象
        return true;
        //返回false菜单无法显示
    }

    /**
     *
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            //item.getItemId()来指定菜单项
            case R.id.add_item:
                Toast.makeText(this, "Add function!!!!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "Remove function", Toast.LENGTH_SHORT).show();
                break;
             default:
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.first_layout);
        //返回一个View对象
        Button button1 = (Button) findViewById(R.id.button_1);
        //为按钮注册监听器
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {  //点击功能 用 .show()显示
                //makeTest的三个参数 1 Context上下文即对象 2 text即显示内容 3 显示时长
                Toast.makeText(MainActivity.this,
                        "Very Good!!",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
