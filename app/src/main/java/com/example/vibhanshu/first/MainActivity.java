package com.example.vibhanshu.first;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startServices(View view){
        String name = Build.DEVICE;
        Intent i = new Intent(this,FirstService.class);
        i.putExtra("Name","Rohan");
        startService(i);

    }

    public void stopServices(View view){

        stopService(new Intent(this,FirstService.class));
    }

    public void startSecondService(View view){
        startService(new Intent(this,SecondService.class));
    }

    public void stopSecondService(View view)
    {
        stopService(new Intent(this,SecondService.class));
    }

    public void Broadcastin(View view){
        Intent intent = new Intent();
        intent.setAction(".CustomReceiver");
        sendBroadcast(intent);
    }
}
