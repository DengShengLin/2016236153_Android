package com.example.uiwidgettest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Button textToast = (Button) findViewById(R.id.textToast);

    Button imageChange = (Button) findViewById(R.id.imageChange);

    Button barVisible = (Button) findViewById(R.id.proBar);

    Button alertDialog = (Button) findViewById(R.id.alertDialog);

    Button profressDialog = (Button) findViewById(R.id.progressDialog);


        /**
         *
         */
    editText = (EditText) findViewById(R.id.edit_text);
        /**
         *
         */
    imageView = (ImageView) findViewById(R.id.image_view);
        /**
         *
         */
//    progressBar = (ProgressBar) findViewById(R.id.progress_bar);
    progressBar = (ProgressBar) findViewById(R.id.progress_bar2);

    textToast.setOnClickListener(this);
    imageChange.setOnClickListener(this);
    barVisible.setOnClickListener(this);
    alertDialog.setOnClickListener(this);
    profressDialog.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            /**
             * 提示符
             */
            case R.id.textToast:
                String inputText = editText.getText().toString();
                if(inputText.length() == 0)
                    Toast.makeText(MainActivity.this, "不能为空！", Toast.LENGTH_SHORT).show();
                if(inputText.length() > 0)
                    Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();
                break;
            /**
             * 设置图片切换
             */
            case R.id.imageChange:
                imageView.setImageResource(R.drawable.img_2);
                break;
            /**
             * 设置进度圈可见变换
             */
            case R.id.proBar:
                /*
                可见设置
                 */

/*                if(progressBar.getVisibility() == View.GONE) {
                    progressBar.setVisibility(View.VISIBLE);
                } else {
                    progressBar.setVisibility(View.GONE);
                }
*/
                /*
                进度增减设置
                 */
                int progress = progressBar.getProgress();
                if(progress < 100 && progress >= 0) {
                    progress = progress + 10;
                } else {
                    progress = progress - 100;
                    if(progress < 0) {
                        progress = 0;
                    }
                }
                progressBar.setProgress(progress);
                break;
            /**
             * 确认提示框
             */
            case R.id.alertDialog:
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("这是一个Dialog");
                dialog.setMessage("重要事情");
                dialog.setCancelable(false);
                /*
                执行任务
                 */
                dialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                /*
                取消任务
                 */
                dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.show();
                break;

                /**
                 * 带进度条的提示框
                 */
            case R.id.progressDialog:
                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("这是带进度条的提示框");
                progressDialog.setMessage("Loading....");
                progressDialog.setCancelable(true);
                progressDialog.show();
//                progressDialog.dismiss();
                break;

            default:
                break;
        }




    }



}
