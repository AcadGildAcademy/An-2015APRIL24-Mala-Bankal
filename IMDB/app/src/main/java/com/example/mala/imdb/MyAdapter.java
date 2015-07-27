package com.example.mala.imdb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mala on 24-07-2015.
 */
public class MyAdapter extends ArrayAdapter<contacts> {
    private final Context context;
    private final List<contacts> info;

    public MyAdapter(Context context, List<contacts> info) {

        super(context, R.layout.list_item, info);
        this.context = context;
        this.info = info;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        // 1. Create inflater
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // 2. Get rowView from inflater
        View rowView = inflater.inflate(R.layout.list_item, parent, false);

        // 3. Get the text views from the rowView
        TextView titleView = (TextView) rowView.findViewById(R.id.title);
        TextView dateView = (TextView) rowView.findViewById(R.id.date);
        TextView popView = (TextView) rowView.findViewById(R.id.pop);
        TextView votesView = (TextView) rowView.findViewById(R.id.votes);

        // 4. Set the text for textViews
        titleView.setText(info.get(position).get_title());
        dateView.setText(info.get(position).get_date());
        popView.setText(info.get(position).get_popularity());
        votesView.setText(info.get(position).getVotes());

        // 5. return rowView
        return rowView;

    }

}
