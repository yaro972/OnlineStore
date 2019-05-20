package com.directmedia.onlinestore.core.entity;


public class Work {
    private String title;
    private String genre;
    private int release;
    private String summary;
    private Artist mainArtist;
    private long id;
    public static long LastId;

    public Work() {
        this.id= LastId ++;
    }

    public Work(String title) {
        this();
        this.title = title;
    }


    public Work(String title, long id) {
        this.title = title;
        this.id = id;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Artist getMainArtist() {
        return mainArtist;
    }

    public void setMainArtist(Artist mainArtist) {
        this.mainArtist = mainArtist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
