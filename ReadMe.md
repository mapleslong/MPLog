> 日志组件的作用是讲输出的日志格式化支持json、file，和普通的log输出 

```java

  在gradle中引入 compile 'com.mapleslong.utils:MPLog:1.1'即可

        //控制log输出的开关
        MPLog.init(true);
        //以下为Log输出的简化
        MPLog.e("error");
        MPLog.d("debug");
        MPLog.a("aaaa");
        MPLog.v("verbose");
        MPLog.i("info");
        MPLog.w("warn");
        MPLog.json("{json:1}");
        MPLog.file(file);
```
