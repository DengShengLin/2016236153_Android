package com.example.firstactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast的点击触发事件用makeTest方法
                Toast.makeText(FirstActivity.this,"Toast的点击触发事件-->进入第二个活动",Toast.LENGTH_SHORT).show();
                //显式Intent
                /*
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);
                */
                //隐式Intent
                Intent intent1 = new Intent("com.example.firstactivity.ACTION_START");
                intent1.addCategory("com.example.firstactivity.MY_CATEGORY");
                startActivity(intent1);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this, "添加操作中...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"移除操作中...",Toast.LENGTH_SHORT).show();
                break;
            case R.id.update_item:
                Toast.makeText(this, "更新操作中...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.exit_item:
                Toast.makeText(this, "退出中...", Toast.LENGTH_SHORT).show();
                finish();
                break;
            default:
        }
        return true;
    }
}
