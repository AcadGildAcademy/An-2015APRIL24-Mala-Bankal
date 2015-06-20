package com.example.mala.project;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;


/**
 * Created by Mala on 17-06-2015.
 */
public class DialogActivity extends Activity implements OnClickListener {

    static Button savebutton;
    static Button cancelbutton;
    static EditText title, description;
    static DatePicker dp;
    static Dialog dialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_dialog);

    }

    protected void showCustomDialog() {
        dialog = new Dialog(this, android.R.style.ThemeOverlay_Material_Dark);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);

        savebutton = (Button) findViewById(R.id.bt_save);
        cancelbutton = (Button) findViewById(R.id.bt_cancel);
        title = (EditText) findViewById(R.id.editTitle);
        description = (EditText) findViewById(R.id.editDesc);
        dp = (DatePicker) findViewById(R.id.datePicker);

        savebutton.setOnClickListener(this);
        cancelbutton.setOnClickListener(this);

        dialog.show();
    }

    @Override
    public void onClick(View v) {

    }
}