package com.example.mala.myservices;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

/**
 * Created by Mala on 29-06-2015.
 */
public class MainActivity extends Activity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button start, stop;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        start = (Button) findViewById(R.id.bt_start);
        stop = (Button) findViewById(R.id.bt_stop);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.bt_start :
                Intent i = new Intent(this, MyService.class);
                startService(i);
                break;
            case R.id.bt_stop :
                i = new Intent(this, MyService.class);
                stopService(i);
        }



    }

}
