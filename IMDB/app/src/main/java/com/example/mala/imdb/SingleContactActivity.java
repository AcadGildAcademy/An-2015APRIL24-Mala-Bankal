package com.example.mala.imdb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Mala on 24-07-2015.
 */
public class SingleContactActivity extends Activity {
    // JSON node keys
    private static final String TAG_TITLE = "original_title";
    private static final String TAG_DATE = "release_date";
    private static final String TAG_POPULARITY = "popularity";
    private static final String TAG_VOTES = "vote_count";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_contact);

        // getting intent data
        Intent in = getIntent();

        // Get JSON values from previous intent
        String title = in.getStringExtra(TAG_TITLE);
        String date = in.getStringExtra(TAG_DATE);
        String pop = in.getStringExtra(TAG_POPULARITY);
        String votes = in.getStringExtra(TAG_VOTES);

        // Displaying all values on the screen
        TextView lblTitle = (TextView) findViewById(R.id.title_label);
        TextView lblDate = (TextView) findViewById(R.id.date_label);
        TextView lblPop = (TextView) findViewById(R.id.pop_label);
        TextView lblVotes = (TextView) findViewById(R.id.votes_label);

        lblTitle.setText(title);
        lblDate.setText(date);
        lblPop.setText(pop);
        lblVotes.setText(votes);
    }
}
