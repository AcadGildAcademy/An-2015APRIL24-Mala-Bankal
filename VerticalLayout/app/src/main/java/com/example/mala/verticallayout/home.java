package com.example.mala.verticallayout;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import static android.content.Intent.ACTION_VIEW;
import static com.example.mala.verticallayout.R.layout.activity_next;
import static java.lang.System.exit;

/**
 * Created by Mala on 04-06-2015.
 */
public class home extends Activity implements OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button apps, settings, vibrate;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        apps = (Button) findViewById(R.id.bt_apps);
        settings = (Button) findViewById(R.id.bt_settings);
        vibrate = (Button) findViewById(R.id.bt_vibrate);

        apps.setOnClickListener(this);
        settings.setOnClickListener(this);
        vibrate.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.bt_settings:
                Intent i = new Intent(home.this, next.class);
                startActivity(i);
                break;
            case R.id.bt_apps:
                Intent i1 = new Intent(home.this, apps.class);
                startActivity(i1);
                break;
            case R.id.bt_vibrate:
                Vibrator vib = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
                vib.vibrate(2000);
                break;

        }

    }
}
