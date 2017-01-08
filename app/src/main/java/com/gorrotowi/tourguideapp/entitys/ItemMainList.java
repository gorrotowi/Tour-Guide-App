package com.gorrotowi.tourguideapp.entitys;

/**
 * Created by Gorro on 06/01/17.
 */

public class ItemMainList {

    private String name;
    private int img;

    public ItemMainList(String name, int img) {
        this.name = name;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
