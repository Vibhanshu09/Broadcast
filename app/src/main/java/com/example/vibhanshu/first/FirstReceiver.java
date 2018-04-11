package com.example.vibhanshu.first;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Vibhanshu on 3/14/2018.
 */

public class FirstReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Rohan Marega Tumko",Toast.LENGTH_LONG).show();
    }
}