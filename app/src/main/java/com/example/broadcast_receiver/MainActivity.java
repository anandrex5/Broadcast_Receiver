package com.example.broadcast_receiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    //Create an Object of the BroadcastExample class
    BroadcastExample br = new BroadcastExample();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onStart() {
        super.onStart();

        //Create an Object IntentFilter class
        IntentFilter filter = new IntentFilter();
        //add Action
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        this.registerReceiver(br,filter);
    }

    @Override
    protected void onStop() {
        super.onStop();

        //Action Unregister
        this.unregisterReceiver(br);
    }
}