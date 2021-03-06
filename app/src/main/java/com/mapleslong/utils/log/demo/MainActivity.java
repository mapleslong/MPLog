package com.mapleslong.utils.log.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mapleslong.utils.log.MPLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //控制log输出的开关
        MPLog.init(this);
        //以下为Log输出的简化
        MPLog.e("error");
        MPLog.d("debug");
        MPLog.a("aaaa");
        MPLog.v("verbose");
        MPLog.i("info");
        MPLog.w("warn");

        MPLog.d("{\"name\":\"Tom\",\"age\":\"22\",\"like\":\"money\",\"character\":[\"kind\",\"cute\"]}{\"name\":\"Tom\",\"age\":\"22\",\"like\":\"money\",\"character\":[\"kind\",\"cute\"]}{\"name\":\"Tom\",\"age\":\"22\",\"like\":\"money\",\"character\":[\"kind\",\"cute\"]}{\"name\":\"Tom\",\"age\":\"22\",\"like\":\"money\",\"character\":[\"kind\",\"cute\"]}{\"name\":\"Tom\",\"age\":\"22\",\"like\":\"money\",\"character\":[\"kind\",\"cute\"]}{\"name\":\"Tom\",\"age\":\"22\",\"like\":\"money\",\"character\":[\"kind\",\"cute\"]}{\"name\":\"Tom\",\"age\":\"22\",\"like\":\"money\",\"character\":[\"kind\",\"cute\"]}{\"name\":\"Tom\",\"age\":\"22\",\"like\":\"money\",\"character\":[\"kind\",\"cute\"]}");
        MPLog.d("{\"name\":\"Tom\",\"age\":\"22\",\"like\":\"money\",\"character\":[\"kind\",\"cute\"]}{\"name\":\"Tom\",\"age\":\"22\",\"like\":\"money\",\"character\":[\"kind\",\"cute\"]}{\"name\":\"Tom\",\"age\":\"22\",\"like\":\"money\",\"character\":[\"kind\",\"cute\"]}{\"name\":\"Tom\",\"age\":\"22\",\"like\":\"money\",\"character\":[\"kind\",\"cute\"]}{\"name\":\"Tom\",\"age\":\"22\",\"like\":\"money\",\"character\":[\"kind\",\"cute\"]}{\"name\":\"Tom\",\"age\":\"22\",\"like\":\"money\",\"character\":[\"kind\",\"cute\"]}{\"name\":\"Tom\",\"age\":\"22\",\"like\":\"money\",\"character\":[\"kind\",\"cute\"]}{\"name\":\"Tom\",\"age\":\"22\",\"like\":\"money\",\"character\":[\"kind\",\"cute\"]}");
        MPLog.json("{json:1}");
    }
}
