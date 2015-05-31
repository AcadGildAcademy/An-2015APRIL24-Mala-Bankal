package com.example.mala.relativelayout;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.util.Log.d;

/**
 * Created by Mala on 29-05-2015.
 */
public class iintents extends Activity implements View.OnClickListener {
    EditText search;
    Button specific, developer, Search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search = (EditText) findViewById(R.id.editSearch);
        specific = (Button) findViewById(R.id.bt_spapp);
        developer = (Button) findViewById(R.id.bt_developer);
        Search = (Button) findViewById(R.id.bt_search);

        specific.setOnClickListener(this);
        developer.setOnClickListener(this);
        Search.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.bt_search:
                d("TAG value", search.getText().toString());
            case R.id.bt_spapp:
                d("TAG value", "Specific App");
            case R.id.bt_developer:
                d("TAG value", "Developer");
        }
    }
}
