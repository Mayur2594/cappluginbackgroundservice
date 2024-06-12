package com.lninfo.capbackgroundservice;

import android.util.Log;

public class MyBackgroundService {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}
