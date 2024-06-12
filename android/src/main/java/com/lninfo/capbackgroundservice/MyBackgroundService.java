package com.lninfo.capbackgroundservice;

import android.util.Log;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;

public class MyBackgroundService extends Service{

    private static final String TAG = "MyBackgroundService";
    private static final int NOTIFICATION_ID = 1;

    @Override
    public void onCreate() {
        super.onCreate();
        startForeground(NOTIFICATION_ID, createNotification());
        // Your background task logic here
    }

    @NonNull
    private NotificationCompat.Builder createNotification() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "background_channel")
            .setContentTitle("Background Task")
            .setContentText("Running background task...")
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .setSmallIcon(R.drawable.ic_notification); // Replace with your icon
        return builder;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Handle any intent actions here
        return START_STICKY; // Restart service if killed
    }
}
