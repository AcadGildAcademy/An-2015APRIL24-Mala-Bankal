package com.example.mala.mybroadcast;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Mala on 10-07-2015.
 */
public class Battery extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.battery);
        TextView batteryInfo = (TextView) findViewById(R.id.text_battery);
        //String value="Battery status";

        Bundle bundle = getIntent().getExtras();
        Toast.makeText(this, (int) bundle.getFloat("Battery percent"), Toast.LENGTH_SHORT).show();
        //Bundle extras = getIntent().getExtras();
        //if (extras != null) {
            //value = extras.getString("Battery level");
            //Log.d("Battery status:", value);
        //}

        //TextView txt = new TextView(this);

       // batteryInfo.setText(value);
        //setContentView(txt);
    }
}
