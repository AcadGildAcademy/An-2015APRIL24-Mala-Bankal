package com.example.mala.project;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

/**
 * Created by Mala on 17-06-2015.
 */
public class AlertDFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                // Set Dialog Icon
                //.setIcon(R.drawable.ic_launcher)
                        // Set Dialog Title
                //.setTitle(getTag())
                        // Set Dialog Message
                //.setMessage("Alert DialogFragment Demo")

                        // Positive button
                .setPositiveButton("SAVE", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Do something else
                        Toast.makeText(getActivity().getApplicationContext(), "Save", Toast.LENGTH_SHORT).show();
                    }
                })

                        // Negative Button
                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,	int which) {
                        // Do something else
                        Toast.makeText(getActivity().getApplicationContext(), "Cancel", Toast.LENGTH_SHORT).show();
                    }
                }).create();
    }
}


