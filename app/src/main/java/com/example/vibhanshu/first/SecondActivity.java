package com.example.vibhanshu.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService(this,TELEPHONY_SERVICE);
    }
}
