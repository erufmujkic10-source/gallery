package com.java.gallery.data.model;


public final class ImageItem {
    private final String id;
    private final String title;
    private final int imageRes;
    private final String descriptionUrl;
    private final long dateAdded;

    public ImageItem(String id, String title, int imageRes, String descriptionUrl, long dateAdded) {
        this.id = id;
        this.title = title;
        this.imageRes = imageRes;
        this.descriptionUrl = descriptionUrl;
        this.dateAdded = dateAdded;
    }


    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getImageRes() {
        return imageRes;
    }

    public String getDescriptionUrl() {
        return descriptionUrl;
    }

    public long getDateAdded() {
        return dateAdded;
    }
}