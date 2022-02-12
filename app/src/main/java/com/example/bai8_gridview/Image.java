package com.example.bai8_gridview;

public class Image {
    private int ImageId;
    private String Name;

    public Image(int imageId, String name) {
        ImageId = imageId;
        Name = name;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
