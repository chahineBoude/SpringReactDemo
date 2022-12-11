package com.example.gundamcatalogue;

import jakarta.persistence.*;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "MOBILESUIT")
public class MobileSuit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id = -1;

    public MobileSuit() {
    }

    public MobileSuit(long id, String name, String info, String universe, String image, String manufacturer, int power, int speed, int control, String weapons, long rating) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.universe = universe;
        this.image = image;
        this.manufacturer = manufacturer;
        this.power = power;
        this.speed = speed;
        this.control = control;
        this.weapons = weapons;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof MobileSuit){
            return id == ((MobileSuit)o).id;
        }
        else return false;
    }

    @Override
    public int hashCode() {
        return (int)id;
    }

    private String name;
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private String universe;
    private String image;
    private String manufacturer;
    private int power;
    private int speed;
    private int control;
    private String weapons;
    private long rating;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
    }

    public String getWeapons() {
        return weapons;
    }

    public void setWeapons(String weapons) {
        this.weapons = weapons;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }
}
