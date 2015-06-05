package com.example.mala.verticallayout;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Created by Mala on 04-06-2015.
 */
public class next extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button wifi, bluetooth, add;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

    }

    public void browseWifi(View v) {

        Intent i = new Intent(Settings.ACTION_WIFI_SETTINGS);
        startActivity(i);

    }

    public void browseBluetooth(View v) {
        Intent i = new Intent(Settings.ACTION_BLUETOOTH_SETTINGS);
        startActivity(i);

    }

    public void browseAddAcc(View v) {
        Intent i = new Intent(Settings.ACTION_ADD_ACCOUNT);
        startActivity(i);

    }

}
