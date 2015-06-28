package com.mobileia.mcdropdownmenu.example;

/**
 * Created by matiascamiletti on 28/6/15.
 */
public class MenuItem {
    private int mId;
    private String mTitle;

    public MenuItem(int id, String title){
        mId = id;
        mTitle = title;
    }

    public int getId(){
        return mId;
    }

    public String getTitle(){
        return mTitle;
    }
}
