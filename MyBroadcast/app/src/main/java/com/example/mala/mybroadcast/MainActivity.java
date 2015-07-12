package com.example.mala.mybroadcast;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.ToggleButton;
//import com.example.mala.broadcast;

/**
 * Created by Mala on 30-06-2015.
 */
public class MainActivity extends Activity {

    ToggleButton toggle;
    CheckBox checkBox;
    WifiManager wifiManager;
    private final String ACTION_MESSAGE = "COM.EXAMPLE.ACTION.MESSAGE";
    private final String ACTION_MESSAGE_EXTRA = "MESSAGE";
    private static final int NOTIFY_ME_ID = 1337;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        toggle = (ToggleButton) findViewById(R.id.toggleWifi);
        checkBox = (CheckBox) findViewById(R.id.checkBroadcast);
        wifiManager = (WifiManager) this.getSystemService(Context.WIFI_SERVICE);
        this.registerReceiver(this.batteryInfoReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
    }

    public void onToggleClicked(View v) {

        StringBuffer result = new StringBuffer();
        result.append("toggle : ").append(toggle.getText());
        Toast.makeText(this, result.toString(), Toast.LENGTH_SHORT).show();

        boolean on = ((ToggleButton) v).isChecked();

        if (on) {
            // Enable wifi
            wifiManager.setWifiEnabled(true);
        } else {
            // Disable wifi
            wifiManager.setWifiEnabled(false);
        }

    }

    public void onCheckboxClicked(View v) {
        boolean checked = ((CheckBox) v).isChecked();
        if (checked) {
            Intent i = new Intent();
            i.setAction(ACTION_MESSAGE);
            i.putExtra(ACTION_MESSAGE_EXTRA, "Broadcast requesting Battery status !");
            sendBroadcast(i);
            NotificationCompat.Builder mybuilder = new NotificationCompat.Builder(this);
            mybuilder.setSmallIcon(R.mipmap.ic_launcher);
            mybuilder.setContentTitle("Battery Status");
            mybuilder.setContentText("Battery");
            mybuilder.setAutoCancel(true);
            Intent result = new Intent(this, Battery.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, result, 0);
            mybuilder.setContentIntent(pendingIntent);
            NotificationManager mNotify = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            mNotify.notify(NOTIFY_ME_ID, mybuilder.build());
        }


    }

    private BroadcastReceiver batteryInfoReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int  level= intent.getIntExtra(BatteryManager.EXTRA_LEVEL,-1);
            int scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE,-1);
            float batteryPct = level / (float)scale;

            //Log.d("level of battery:", level);
            Intent i = new Intent(context, Battery.class);
            i.putExtra("Battery percent", batteryPct);
            //Bundle b = new Bundle();
            //b.putInt("Battery percent", batteryPct);
            //i.putExtras(b);
            //startActivity(i);
            //startActivity(i);
        }
    };
}


