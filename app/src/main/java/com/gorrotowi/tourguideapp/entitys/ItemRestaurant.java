package com.gorrotowi.tourguideapp.entitys;

/**
 * Created by Gorro on 07/01/17.
 */

public class ItemRestaurant {

    private int img;
    private String name;
    private String description;
    private String location;
    private double lat;
    private double lng;

    public ItemRestaurant(int img, String name, String description, String location, double lat, double lng) {
        this.img = img;
        this.name = name;
        this.description = description;
        this.location = location;
        this.lat = lat;
        this.lng = lng;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}
