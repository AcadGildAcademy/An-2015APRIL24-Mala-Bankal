package com.example.mala.project;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mala on 14-06-2015.
 */
public class MainActivity extends Activity implements View.OnClickListener {
// AppCompatActivity implements View.OnClickListener {

    Button savebutton;
    Button cancelbutton;
    EditText title, description;
    DatePicker dp;
    Dialog dialog;
    DatabaseHandler db = new DatabaseHandler(this);

    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getActionBar();
        actionBar.show();

        // 1. pass context and data to the custom adapter
        MyAdapter adapter = new MyAdapter(this, generateData());
        // 2. Get ListView from activity_main.xml
        ListView listView = (ListView) findViewById(R.id.listview);
        // 3. setListAdapter
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        CreateMenu(menu);
        return true;
    }

    private void CreateMenu(Menu menu) {
        MenuItem mnu1 = menu.add(0, 0, 0, "ADD Item");
        {
            mnu1.setIcon(R.mipmap.ic_plus);
            mnu1.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        }
        MenuItem mnu2 = menu.add(0,1,1,"Completed Activity");
        {
            mnu1.setIcon(R.mipmap.ic_like_before);
            mnu1.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == 0) {
            Toast.makeText(getApplicationContext(), "Add Item", Toast.LENGTH_LONG).show();
            this.showCustomDialog();
            return true;

        }else if (id == 1) {
            Toast.makeText(getApplicationContext(), "clicked on Item 2", Toast.LENGTH_LONG).show();

            return true;
        }

        return false;
        //return super.onOptionsItemSelected(item);
    }


    private ArrayList<Item> generateData(){
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Item 1","First Item on the list", "time"));
        items.add(new Item("Item 2", "Second Item on the list", "time"));
        items.add(new Item("Item 3", "Third Item on the list", "time"));
        return items;
    }

    protected void showCustomDialog() {
        dialog = new Dialog(MainActivity.this, android.R.style.Theme_Translucent);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);

        dialog.setContentView(R.layout.activity_dialog);

        savebutton = (Button) dialog.findViewById(R.id.bt_save);
        cancelbutton = (Button) dialog.findViewById(R.id.bt_cancel);
        title = (EditText) dialog.findViewById(R.id.editTitle);
        description = (EditText) dialog.findViewById(R.id.editDesc);
        dp = (DatePicker) dialog.findViewById(R.id.datePicker);

        savebutton.setOnClickListener(this);
        cancelbutton.setOnClickListener(this);

        dialog.show();
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.bt_save :
                String tit = title.getText().toString();
                String desc = description.getText().toString();
                String month = String.valueOf(dp.getMonth() + 1);
                String day = String.valueOf(dp.getDayOfMonth());
                String year = String.valueOf(dp.getYear());
                String date = day + "/"+ month +"/"+ year;

                Log.d("date", date);

                //save entries to database

                Log.d("Insert: ", "Inserting ..");
                db.addInfo(new todo(tit,desc,date));


                // Reading all data
                /*Log.d("Reading: ", "Reading all contacts..");
                List<todo> td = db.getAllInfo();

                //List<String> table = new ArrayList<String>();

                for (todo cn : td) {
                    String log = "Id: " + cn.get_id() + " ,Title: " + cn.get_title() + " ,Description: " + cn.get_description() +
                            " ,Date: " + cn.get_date() + " ,Status: " + cn.get_status();
                    // Writing Contacts to log
                    Log.d("Log ! : ", log);
                    //table.add(log);
                }*/

                dialog.dismiss();
                break;
            case R.id.bt_cancel :
                dialog.dismiss();
                break;
            default :
                break;

        }

    }


}
