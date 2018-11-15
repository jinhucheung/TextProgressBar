TextProgressBar
===================
显示进度文字跟随进度值移动的进度条组件,同时该组件也可以做分割线显示.

在使用高德地图APP时,发现其离线地图下载中的进度条样式十分有趣,就决定在[导航犬(Go)](https://github.com/HiKumho/Go)中使用.现在将TextProgressBar独立出来.


## 实现效果及参照

<img src="https://github.com/HiKumho/TextProgressBar/blob/master/img_test.jpg?raw=true" width="35%" height="35%"/>
<img src="https://github.com/HiKumho/TextProgressBar/blob/master/img_preview.jpg?raw=true" width="35%" height="35%"/>
<br/>

## 属性说明

|属性|描述|格式|
|:----:|:----:|:----:|
|max|进度条最大值|integer|
|progress|当前的进制值|integer|
|progress_barHeight|进度条高度,并不含文字的高度|dimension|
|backgroundColor|进度条的背景颜色|color|
|progressColor|显示当前进度的颜色|color|
|textColor|描述进度的文字颜色|color|



## 具体使用

- 作为进度条上:TextProgressBar与ProgressBar一样使用.

- 作为分割线上:如需要在AdapterView(比如ListView)中,让TextProgressBar做为子视图的分割线,需将AdapterView的`divider="@null"`,TextProgressBar需位于子视图最底部

