package com.lninfo.capbackgroundservice;

import android.content.Context;
import android.content.Intent;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "MyBackgroundService")
public class MyBackgroundServicePlugin extends Plugin {

    @Override
    public void load() {
        addJavaScript("startBackgroundTask", (call) -> {
            startBackgroundService();
            return null;
        });
    }

    private void startBackgroundService() {
        Context context = getContext();
        Intent serviceIntent = new Intent(context, MyBackgroundService.class);
        context.startService(serviceIntent);
    }
}
