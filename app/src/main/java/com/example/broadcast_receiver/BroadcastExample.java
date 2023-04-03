package com.example.broadcast_receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadcastExample extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        //Create an container to catch this boolean parameter if we on the Airplane its value is true else false
        boolean isPlaneMode = intent.getBooleanExtra("state",false);

        if (isPlaneMode = true)
        {
        Toast.makeText(context, "Device is in Airplane Mode", Toast.LENGTH_LONG).show();
    }
        else {
            Toast.makeText(context, "Device is not in Airplane Mode", Toast.LENGTH_LONG).show();
        }
        }

}

