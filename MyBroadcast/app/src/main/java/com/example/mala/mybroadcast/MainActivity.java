package com.example.mala.mybroadcast;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.ToggleButton;

/**
 * Created by Mala on 30-06-2015.
 */
public class MainActivity extends Activity {

    ToggleButton toggle;
    CheckBox checkBox;
    WifiManager wifiManager = (WifiManager) this.getSystemService(Context.WIFI_SERVICE);
    private final String ACTION_MESSAGE = "COM.EXAMPLE.ACTION.MESSAGE";
    private final String ACTION_MESSAGE_EXTRA = "MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        toggle = (ToggleButton) findViewById(R.id.toggleWifi);
        checkBox = (CheckBox) findViewById(R.id.checkBroadcast);
    }

    public void onToggleClicked(View v) {
        NotificationCompat.Builder mybuilder = new NotificationCompat.Builder(
                this).setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Wifi Status")
                .setContentText("Wifi");


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

    public void onCheckboxClicked(View v){
        boolean checked = ((CheckBox) v).isChecked();
        if (checked) {
            Intent i = new Intent();
            i.setAction(ACTION_MESSAGE);
            i.putExtra(ACTION_MESSAGE_EXTRA, "Broadcast requesting Battery status !");
            sendBroadcast(i);
        }


    }

}
