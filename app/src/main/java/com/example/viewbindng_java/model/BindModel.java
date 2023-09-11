package com.example.viewbindng_java.model;

public class BindModel {
    String name;
    String ImageUri;

    public BindModel(String name, String imageUri) {
        this.name = name;
        ImageUri = imageUri;
    }

    public String getName() {
        return name;
    }

    public String getImageUri() {
        return ImageUri;
    }
}
