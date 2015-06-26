package com.example.mala.project;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mala on 15-06-2015.
 */
public class DatabaseHandler extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "todoManager";

    // table name
    private static final String TABLE_TODO = "todo";

    // Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_TITLE = "title";
    private static final String KEY_DESCRIPTION = "description";
    private static final String KEY_DATE = "date";
    private static final String KEY_STATUS = "0";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TODO_TABLE = "CREATE TABLE " + TABLE_TODO + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_TITLE + " TEXT,"
                + KEY_DESCRIPTION + " TEXT," + KEY_DATE + " TEXT,"
                + KEY_STATUS + " INTEGER " + ")";
        db.execSQL(CREATE_TODO_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_TODO);

        // Create tables again
        onCreate(db);
    }

    /**
     * All CRUD(Create, Read, Update, Delete) Operations
     */

    // Adding new info
    void addInfo(todo td) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_TITLE, td.get_title());
        values.put(KEY_DESCRIPTION, td.get_description());
        values.put(KEY_DATE, td.get_date());
        values.put(KEY_STATUS, td.get_status());

        // Inserting Row
        db.insert(TABLE_TODO, null, values);
        db.close(); // Closing database connection
    }

    // Getting single info
    todo getInfo(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_TODO, new String[] { KEY_ID,
                        KEY_TITLE, KEY_DESCRIPTION, KEY_DATE, KEY_STATUS }, KEY_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        todo td = new todo(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2),
                cursor.getString(3), Integer.parseInt(cursor.getString(4)));
        // return
        return td;
    }

    // Getting All Info
    public List<todo> getAllInfo() {
        List<todo> todoList = new ArrayList<todo>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_TODO;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                todo td = new todo();
                td.set_id(Integer.parseInt(cursor.getString(0)));
                td.set_title(cursor.getString(1));
                td.set_description(cursor.getString(2));
                td.set_date(cursor.getString(3));
                td.set_status(cursor.getInt(4));
                // Adding contact to list
                todoList.add(td);
            } while (cursor.moveToNext());
        }

        // return info list
        return todoList;
    }

    // Updating single info
    public int updateInfo(todo td) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_TITLE, td.get_title());
        values.put(KEY_DESCRIPTION, td.get_description());
        values.put(KEY_DATE, td.get_date());
        values.put(KEY_STATUS, td.get_status());

        // updating row
        return db.update(TABLE_TODO, values, KEY_ID + " = ?",
                new String[] { String.valueOf(td.get_id()) });
    }

    // Deleting single info
    public void deleteInfo(todo td) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_TODO, KEY_ID + " = ?",
                new String[] { String.valueOf(td.get_id()) });
        db.close();
    }


    // Getting info Count
    public int getInfoCount() {
        String countQuery = "SELECT  * FROM " + TABLE_TODO;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        // return count
        return cursor.getCount();
    }
}
