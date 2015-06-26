package com.example.mala.project;

/**
 * Created by Mala on 13-06-2015.
 */
public class Item {
    private String title;
    private String description;
    private String time;


    public Item(String title, String description, String time) {
        super();
        this.title = title;
        this.description = description;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
