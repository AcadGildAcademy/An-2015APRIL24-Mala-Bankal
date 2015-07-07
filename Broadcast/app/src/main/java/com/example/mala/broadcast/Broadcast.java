package com.example.mala.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Mala on 06-07-2015.
 * Broadcast is the receiver class, sender class is 'MyBroadcast'
 */
public class Broadcast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals("COM.EXAMPLE.ACTION.MESSAGE")) {
            Toast.makeText(context, intent.getStringExtra("MESSAGE").toString(), Toast.LENGTH_LONG).show();
        }
        else if(intent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {

        }
    }
}
