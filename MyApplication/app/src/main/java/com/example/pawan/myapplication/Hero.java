package com.example.pawan.myapplication;

/**
 * Created by pawan on 23/3/18.
 */

public class Hero {
    private String name,realname,imageurl;
    public Hero(String name, String realname,String imageurl) {
        this.name = name;
        this.realname = realname;
        this.imageurl = imageurl;
    }
    public String getName() {
        return name;
    }
    public String getRealname() {
        return realname;
    }
    public String getImageurl() {
        return imageurl;
    }
}
