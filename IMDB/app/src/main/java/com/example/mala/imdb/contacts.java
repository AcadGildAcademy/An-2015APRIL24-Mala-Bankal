package com.example.mala.imdb;

import android.media.Image;

/**
 * Created by Mala on 24-07-2015.
 */
public class contacts {

    String _title;
    String _date;
    String _popularity;
    String _votes;
    Image img;

    public contacts() {
    }

    public contacts(String _title, String _date, String _popularity, String votes, Image img) {
        this._title = _title;
        this._date = _date;
        this._popularity = _popularity;
        this._votes = votes;
        this.img = img;
    }

    public contacts(String _title, String _date, String _popularity, String votes) {
        this._title = _title;
        this._date = _date;
        this._popularity = _popularity;
        this._votes = votes;

    }

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public String get_date() {
        return _date;
    }

    public void set_date(String _date) {
        this._date = _date;
    }

    public String get_popularity() {
        return _popularity;
    }

    public void set_popularity(String _popularity) {
        this._popularity = _popularity;
    }

    public String getVotes() {
        return _votes;
    }

    public void setVotes(String votes) {
        this._votes = votes;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }
}