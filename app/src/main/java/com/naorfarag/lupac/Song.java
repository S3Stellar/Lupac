package com.naorfarag.lupac;

public class Song {
    private String title;
    private String genre;
    private String description;
    private int thumbnail;

    //Default constructor
    public Song(){

    }

    public Song(String title, String genre, String description, int thumbnail) {
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
