TextProgressBar
===================
显示进度文字跟随进度值移动的进度条组件,同时该组件也可以做分割线显示.

===================

在使用高德地图APP时,发现其离线地图下载中的进度条样式十分有趣,就决定在[导航犬(Go)](https://github.com/HiKumho/Go)中使用.现在将TextProgressBar独立出来.

===================


## 实现效果及参照

<img src="https://github.com/HiKumho/TextProgressBar/blob/master/img_test.jpg?raw=true" width="35%" height="35%" style="margin-right:20px"/>
<img src="https://github.com/HiKumho/TextProgressBar/blob/master/img_preview.jpg?raw=true" width="35%" height="35%"/>
<br/>

## 属性说明
```
 <!--TextProgressBar:文本随进度值移动的进度条-->
    <attr name="progress_barHeight" value="dimension" />
    <declare-styleable name="TextProgressBar">
        <!--max:进度条最大值-->
        <attr name="max" format="integer" />
        <!--progress:当前的进制值-->
        <attr name="progress" format="integer" />
        <!--progress_barHeight:进度条高度,并不含文字的高度  -->
        <attr name="progress_barHeight" />
        <!--backgroundColor:进度条的背景颜色 -->
        <attr name="backgroundColor" format="color" />
        <!--progressColor:显示当前进度的颜色 -->
        <attr name="progressColor" format="color" />
        <!--textColor:描述进度的文字颜色-->
        <attr name="textColor" format="color" />
    </declare-styleable>
```


## 具体使用

- 作为进度条上:TextProgressBar与ProgressBar一样使用.
- 作为分割线上:如需要在AdapterView(比如ListView)中,让TextProgressBar做为子视图的分割线,需将AdapterView的`divider="@null"`,TextProgressBa需位与子视图最底部


