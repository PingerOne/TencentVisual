package com.pingerx.visual.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tencent.mta.track.StatisticsDataAPI;


/**
 * 可视化埋点
 * @see [https://mta.qq.com/docs/app_advance_access_visual_burial.html]
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 可视化sdk初始化
        StatisticsDataAPI.instance(this);
    }
}
