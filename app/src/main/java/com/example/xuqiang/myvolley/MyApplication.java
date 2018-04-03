package com.example.xuqiang.myvolley;

import android.app.Application;

/**
 * ================================================
 * 作    者：marsxq
 * 创建日期：2018/4/3
 * 描    述：
 * ================================================
 */
public class MyApplication extends Application {

    public static MyApplication myApplication;

    @Override
    public void onCreate() {
        super.onCreate();

        myApplication = this;
    }

    public static MyApplication getInstance() {
        return myApplication;
    }
}
