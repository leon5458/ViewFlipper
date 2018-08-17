# ViewFlipper
#### 效果图
![](https://github.com/leon5458/ViewFlipper/blob/master/ViewFlipper/viewfiller.gif)

ViewFlipper使用介绍

在xml布局中的方法介绍:

android:autoStart：   设置自动加载下一个View

android:flipInterval：设置View之间切换的时间间隔

android:inAnimation： 设置切换View的进入动画

android:outAnimation：设置切换View的退出动画

当然同样的在代码中也可以设置：

isFlipping：     判断View切换是否正在进行

setFilpInterval：设置View之间切换的时间间隔

startFlipping：  开始View的切换，而且会循环进行

stopFlipping：   停止View的切换

setOutAnimation：设置切换View的退出动画

setInAnimation： 设置切换View的进入动画

showNext：       显示ViewFlipper里的下一个View

showPrevious：   显示ViewFlipper里的上一个View