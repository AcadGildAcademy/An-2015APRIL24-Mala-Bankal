package com.example.mala.imdb;

import android.content.Intent;
import android.media.Image;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mala on 22-07-2015.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {

    private static String url;

    private static final String TAG_CONTACTS = "results";
    private static final String TAG_TITLE = "original_title";
    private static final String TAG_DATE = "release_date";
    private static final String TAG_POPULARITY = "popularity";
    private static final String TAG_VOTES = "vote_count";
    //private static final Image TAG_IMG = "image";

    JSONArray contactsarr = null;

    ArrayList<contacts> contactList;
    ListView lv ;
    //List<contacts> ctlst = null;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();

        contactList = new ArrayList<contacts>();
        //adapter = new MyAdapter(this, contactList);
        lv = (ListView) findViewById(R.id.list1);
        //lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        // getting values from selected ListItem
        String title = ((TextView) view.findViewById(R.id. title))
                .getText().toString();
        String reldate = ((TextView) view.findViewById(R.id.date))
                .getText().toString();
        String pop = ((TextView) view.findViewById(R.id.pop))
                .getText().toString();
        String votes = ((TextView) view.findViewById(R.id.votes))
                .getText().toString();

        // Starting single contact activity
        Intent in = new Intent(getApplicationContext(),
                SingleContactActivity.class);
        in.putExtra(TAG_TITLE, title);
        in.putExtra(TAG_DATE, reldate);
        in.putExtra(TAG_POPULARITY, pop);
        in.putExtra(TAG_VOTES, votes);
        startActivity(in);
    }


    /**
     * Async task class to get json by making HTTP call
     * */
    private class GetContacts extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void... arg0) {
            // Creating service handler class instance
            ServiceHandler sh = new ServiceHandler();

            // Making a request to url and getting response
            String jsonStr = sh.makeServiceCall(url, ServiceHandler.GET);

            Log.d("Response: ", "> " + jsonStr);

            if (jsonStr != null) {
                try {
                    JSONObject jsonObj = new JSONObject(jsonStr);

                    // Getting JSON Array node
                    contactsarr = jsonObj.getJSONArray(TAG_CONTACTS);
                    //Log.d("array fetched:" , contactsarr);

                    // looping through All Contacts
                     for (int i = 0; i < contactsarr.length(); i++) {
                        JSONObject c = contactsarr.getJSONObject(i);

                        String title = c.getString(TAG_TITLE);
                        String date = c.getString(TAG_DATE);
                        String popularity = c.getString(TAG_POPULARITY);
                        String votes = c.getString(TAG_VOTES);
                        Log.d("title", title);
                        Log.d("date", date);
                        Log.d("popularity", popularity);
                        Log.d("votes", votes);

                        // pass all data to the contacts
                        contacts ct = new contacts();
                        ct._title = title;
                        ct._date = date;
                        ct._popularity = popularity;
                        ct._votes = votes;

                        contactList.add(ct);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                Log.e("ServiceHandler", "Couldn't get any data from the url");
            }
            return null;
        }
        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            adapter = new MyAdapter(MainActivity.this, contactList);
            lv.setAdapter(adapter);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1, menu);
        //return super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            //case R.id.mainmenu:
            case R.id.menu1:
                url = "http://api.themoviedb.org/3/movie/latest?api_key=8496be0b2149805afa458ab8ec27560c";
                //Toast.makeText(getApplicationContext(), "Most Popular", Toast.LENGTH_LONG).show();
                new GetContacts().execute();
                break;
            case R.id.menu2:
                Toast.makeText(getApplicationContext(), "Upcoming Movies", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu3:
                Toast.makeText(getApplicationContext(), "Latest Movies", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu4:
                Toast.makeText(getApplicationContext(), "Now Playing", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu5:
                Toast.makeText(getApplicationContext(), "Top Rated", Toast.LENGTH_LONG).show();
                break;
            case R.id.watch:
                Toast.makeText(getApplicationContext(), "My Watchlist", Toast.LENGTH_LONG).show();
                break;
            case R.id.fav:
                Toast.makeText(getApplicationContext(), "My Favourites", Toast.LENGTH_LONG).show();
                break;
            case R.id.refresh:
                Toast.makeText(getApplicationContext(), "Refresh", Toast.LENGTH_LONG).show();
                break;
        }

        return true;
    }
}