# Android 活动的生命周期
---

## 一、活动
1. 活动是什么?
    包含用户界面的组件，主要用于和用户进行交互。
2. 活动的基本用法
  （1）Android程序讲究逻辑与视图分离;
  （2）android:id 元素当前唯一的标识符l android:width 元素宽度 android:height 元素高度。
  （3）wrap_content 当前元素刚好包括里面东西,Fill_parent 填满父类容器。
  （4）setContentView()方法给当前活动加载一个布局，必须要在AndroidManifest.xml中注册，但AS已经帮我们动态注册。
  （5）Toast方法,较为简单。Toast.maketext().show()。
  （6）在活动中使用Menu:
    1. res目录下创建menu文件夹，创建Menu Resource file。添加item菜单项，菜单项包括了id与titile两个label。
    2. 重写OnCreateOptionMenu方法来加载布局。重写onOptionItemSelected方法来定义响应事件。P39
  （7）销毁一个活动:Back键或finish方法。

使用Intent在活动之间穿梭
（1）使用显式Intent
    Intent是Android程序中各组件之间的一种交互方式。用于启动活动、服务以及发送广播。

Intent intent = new Intent(MainActivity.this,SecondActivity.clalss);
startAcitvity(intent);
## 二、使用Intent在活动之间穿梭
### 使用显式Intent
Intent是Android程序中各组件之间的一种交互方式。用于启动活动、服务以及发送广播。

> Intent intent = new Intent(MainActivity.this,SecondActivity.clalss);
> startAcitvity(intent);

### 使用隐式Intent
1. 在xml中设置，<action>标签指明了当前活动可以响应com.nwu.hzk.ACTION_START这一活动，在隐式调用时必须加上<category>标签为android.intent.category.DEFAULT。这样才能得到隐式Intent的响应。
2. 系统去分析这个Intent，并找出合适的启动活动去启动。启动方法大致与显式相同，
> Intent intent =new Intent(“com.nwu.hzk.ACTION_START”);
> startActivity(intent);

3. 更多隐式Intent的用法，比如调用浏览器，也可以用来打电话。
> Intent intent =new Intent(Intent.ACTION_VIEW);
> //指定Action为ACTION_VIEW
> Intent.setData(Uri.parse(“http://www.baidu.com”));
> //将Uri对象传递进去
> startActivity(intent);
    
### 发送接受数据
1. 传递数据：intent.putExtra(“extra_data”,data);第一个参数为键，第二个参数才是真正要传递的数据。
2. 在另一个Activity中接收数据。
> Intent intent = getIntent();
> String data=intent.getStringExtra(“extra_data”);
> //getIntent()用于启动该Activity的Intent，然后传入相应键值获取数据。

3. 返回数据给上一个活动
     FirstActivity中startActivityForResult(intent,1);//1为请求码
     SecondActivity中增加setResult(RESULT_OK,intent);//专门向上一个活动来返回处理结果。
## 三、Activity活动生命周期
程序启动后依次执行：
onCreate –> onStart –> onResume –> onPause –> onStop –> onDestroy

## 四、



