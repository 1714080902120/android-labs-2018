
# 一、实验目的

1、掌握Android网络访问方法

2、理解XML和JSON表示数据的方法

## 二、实验内容

1、从网络下载一个文件（图片、MP3、MP4）

2、保存到手机，在应用中使用文件

3、将应用运行结果截图

## 三、实验步骤

1、在AndroidManifest文件中添加网络访问权限

2、修改布局，在xml文件中加一个Button用于点击下载图片，加一个ImageView控件用来显示图片

3、新建一个类，开辟一个线程，用于向网络发送请求

4、在Activity的类中调用此线程方法，实现点击按钮时下载图片

## 四、实验截图


![screen](https://github.com/Susie-Lau/android-labs-2018/blob/master/com1614080901125/%236/res/drawable/text6.png)

## 五.实验体会
   
     这次实验的难点在于设置app访问网络的权限以及下载图片的功能实现，刚开始时输入几个图片链接发现在apk文件上都下载不下来，还以为是代码出错，后来再重试几次发现是图片问题，
有的图片能下载成功，有一些则不能，虽然现在还搞不懂是什么原因造成的，但在以后的自主学习中我相信这些问题都会被解决的。
