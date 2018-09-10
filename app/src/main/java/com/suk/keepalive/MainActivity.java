package com.suk.keepalive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.suk.method01.DaemonService;
//http://blog.csdn.net/andrexpert/article/details/75045678
//探讨Android6.0及以上系统APP常驻内存(保活)实现-争宠篇
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startService(View view) {
        startService(new Intent(this, DaemonService.class));
    }
}
