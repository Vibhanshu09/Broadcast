package com.example.vibhanshu.first;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Vibhanshu on 3/14/2018.
 */

public class FirstService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(getApplicationContext(),"Service is created",Toast.LENGTH_LONG).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String extraName = intent.getStringExtra("Name");
        Toast.makeText(getApplicationContext(),"Service is started by: " + extraName,Toast.LENGTH_LONG).show();
        stopSelf(); //no need to call onDistroy() method manually or by user
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"Service is destroyed",Toast.LENGTH_LONG).show();
    }
}
