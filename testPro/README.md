# Android 第一章学习
---

## 一、四大组件
1. Activity<活动>
2. Service<服务>
3. Broadcast Receiver<广播接收器>
4. Content Provider<内容提供器>）

## 二、开发环境
JDK8 + SDK + Android Studio，搭建过程参考书籍《第一行代码》。

## 三、文件结构：
1. local.prorerties:SDK、NDK路径，自动生成

2. app目录下：
    1. libs:引入的第三方jar包
	2. java:所有java代码
	3. res:图片、布局、字符串资源等
	4. AndroidManifest.xml:程序定义的四大控件+权限说明
	5. build.gradle:app的gradle构建脚本

3. res目录下：
    1. drawable:图片
    2. mipmap:应用图标
    3. values:字符串、样式、颜色
    4. layout:布局文件

## 四、日志工具的使用
    1. Log.v(),打印较为琐碎、意义最小的日志工具；
    2. Log.d(),打印一些调试信息
    3. Log.i(),打印一些比较重要数据，分析用户行为数据;
    4. Log.w(),打印一些警告信息，潜在的风险;
    5. Log.e(),打印错误信息。



