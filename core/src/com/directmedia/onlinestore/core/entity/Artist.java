package com.directmedia.onlinestore.core.entity;

public class Artist {
    private String name;

    public Artist() {

    }

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }
}