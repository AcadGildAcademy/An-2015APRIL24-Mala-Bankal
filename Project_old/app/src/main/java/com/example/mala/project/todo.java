package com.example.mala.project;

/**
 * Created by Mala on 15-06-2015.
 */
public class todo {
    int _id;
    String _title;
    String _description;
    String _date;
    int _status;

    public todo() {

    }

    public todo(int _id, String _title, String _description, String _date, int _status) {
        this._id = _id;
        this._title = _title;
        this._description = _description;
        this._date = _date;
        this._status = _status;
    }

    public todo(String _title, String _description, String _date) {

        this._title = _title;
        this._description = _description;
        this._date = _date;

    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public String get_date() {
        return _date;
    }

    public void set_date(String _date) {
        this._date = _date;
    }

    public int get_status() {
        return _status;
    }

    public void set_status(int _status) {
        this._status = _status;
    }
}
