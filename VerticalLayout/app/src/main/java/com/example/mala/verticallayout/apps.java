package com.example.mala.verticallayout;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.net.URI;
import java.net.URISyntaxException;
import static android.util.Log.d;
/**
 * Created by Mala on 05-06-2015.
 */
public class apps extends Activity {
    EditText search;
    Button specific, developer, Search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps);

    }


    public void browseGoogle(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps?hl=en"));
        startActivity(i);
    }

    public void browseDeveloper(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/search?q=google&c=apps&hl=en"));
        startActivity(i);
    }

    public void searchGoogle(View v) {
        search = (EditText) findViewById(R.id.editSearch);
        String SEARCH = search.getText().toString();
        d("TAG value", SEARCH);
        if (SEARCH.equals(null) || SEARCH.equals("")) {
            Toast.makeText(getApplication(), "Please enter a String", Toast.LENGTH_LONG).show();
        } else {
            String input = "https://play.google.com/store/search?q=";

            try {
                URI newuri = new URI(input, SEARCH, null);
                String stringUri = newuri.toString();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(stringUri));
                startActivity(i);
            } catch (URISyntaxException e) {
                System.out.println("URI is a malformed URL");
            }

        }
    }
}
