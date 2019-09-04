package com.example.penshop;

public class Pens {
    @Override
    public String toString() {
        return super.toString();
    }

    private int id;
    private colorPen color;
    private typePen type;
    private String band;
    private Double price;

    public Pens(int id, colorPen color, typePen type, String band, Double price) {
        this.id = id;
        this.color = color;
        this.type = type;
        this.band = band;
        this.price = price;
    }

    enum typePen {
        BallPoint,
        Marker,
        Gel,
        Stylus,
        Highlighters,
        Rollerball
    }

    enum colorPen {
        Blue,
        Black,
        Red
    }

    public int getId() {
        return id;
    }

    public colorPen getColor() {
        return color;
    }

    public typePen getType() {
        return type;
    }

    public String getBand() {
        return band;
    }

    public Double getPrice() {
        return price;
    }
}
