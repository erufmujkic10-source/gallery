package com.java.gallery.data.repository;

import com.example.gallery.R;
import com.java.gallery.data.model.ImageItem;
import java.util.ArrayList;
import java.util.List;

public class ImageRepository {
    private static ImageRepository instance;
    private final List<ImageItem> items = new ArrayList<>();


    private ImageRepository() {
        loadInitialData();
    }

    public static synchronized ImageRepository getInstance() {
        if (instance == null) {
            instance = new ImageRepository();
        }
        return instance;
    }

    private void loadInitialData() {
        long now = System.currentTimeMillis();
        long day = 86400000L;


        items.add(new ImageItem("1", "Paris", R.drawable.img_paris, "https://en.m.wikipedia.org/wiki/Paris", now - 7 * day));
        items.add(new ImageItem("2", "Tokyo", R.drawable.img_tokyo, "https://en.m.wikipedia.org/wiki/Tokyo", now - 6 * day));
        items.add(new ImageItem("3", "New York", R.drawable.img_newyork, "https://en.m.wikipedia.org/wiki/New_York_City", now - 5 * day));
        items.add(new ImageItem("4", "Rome", R.drawable.img_rome, "https://en.m.wikipedia.org/wiki/Rome", now - 4 * day));
        items.add(new ImageItem("5", "Sydney", R.drawable.img_sydney, "https://en.m.wikipedia.org/wiki/Sydney", now - 3 * day));
        items.add(new ImageItem("6", "Dubai", R.drawable.img_dubai, "https://en.m.wikipedia.org/wiki/Dubai", now - 2 * day));
        items.add(new ImageItem("7", "London", R.drawable.img_london, "https://en.m.wikipedia.org/wiki/London", now - 1 * day));
        items.add(new ImageItem("8", "Barcelona", R.drawable.img_barcelona, "https://en.m.wikipedia.org/wiki/Barcelona", now));
    }


    public List<ImageItem> getItemsList() {
        return new ArrayList<>(items);
    }
}