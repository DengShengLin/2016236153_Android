### 安卓的生命周期

Activity生命周期最主要的一些方法，启动后依次执行：

onCreate –> onStart –> onResume –> onPause –> onStop –> onDestroy



### 按钮跳转

- 作业：两个按钮实现活动之间的跳转

- 如何使用debug模式，通过使用快捷键F7 F8 F9 ，

- 正则表达式的使用，主要是搜索文件


> 思路是：
>
> 1. hello1类实现onclickListener这个监听器
> 2. 重写onclick()方法，判断是点击了哪个View，添加intent意图，然后启动活动。
> 3. 装配响应事件settupClick()：创建按钮对象,该对象先后指向两个按钮，然后创建监听事件



