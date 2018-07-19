package com.example.android.tourguide;

/**
 * Created by krzysztof on 19.07.18.
 */

public class Attraction {

    private String name;
    private String description;
    private int imageResourceId;


    public Attraction(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Attraction(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
