package com.example.penshop;

import java.io.Serializable;

public class Gsoft implements Pens, Serializable {
    private String band;
    private String color;
    private String type;
    private Double price;

    public Gsoft(String color, String type, Double price) {
        this.color = color;
        this.type = type;
        this.price = price;
        this.setBandPen();
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public void setBandPen() {
        this.band = "G-Soft";
    }
}
