package com.example.mala.sortinglist1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static android.view.View.*;

/**
 * Created by Mala on 06-06-2015.
 */
public class sorting extends Activity implements OnClickListener {

    ListView listview;
    Button asc, desc;
    String[] list = {"Jan", "Feb", "March", "April", "May", "June", "July"};
    ArrayList<String> listItems;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sort);

        listview = (ListView) findViewById(R.id.listView);
        asc = (Button) findViewById(R.id.bt_asc);
        desc = (Button) findViewById(R.id.bt_desc);

        listItems = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, list);
        listview.setAdapter(adapter);

        asc.setOnClickListener(this);
        desc.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_asc:
                Arrays.sort(list);
                adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, list);
                listview.setAdapter(adapter);
                break;
            case R.id.bt_desc:
                Arrays.sort(list);
                List<String> list_r = Arrays.asList(list);
                Collections.reverse(list_r);
                adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, list_r);
                listview.setAdapter(adapter);
                break;
        }
    }
}
