package com.example.penshop;

import java.util.ArrayList;

public class PensFactory {
    public static Pens[] totalPens = new Pens[]{
            new Pens(1, Pens.colorPen.Blue, Pens.typePen.BallPoint, "Horse", 15.00),
            new Pens(2, Pens.colorPen.Black, Pens.typePen.Marker, "Horse", 55.00),
            new Pens(3, Pens.colorPen.Blue, Pens.typePen.Gel, "Pentel", 30.25),
            new Pens(4, Pens.colorPen.Black, Pens.typePen.Gel, "Faber Castell", 20.75),
            new Pens(5, Pens.colorPen.Blue, Pens.typePen.BallPoint, "G-Soft", 10.05),
            new Pens(6, Pens.colorPen.Red, Pens.typePen.Stylus, "Pilot", 70.50),
            new Pens(7, Pens.colorPen.Blue, Pens.typePen.BallPoint, "Faber Castell", 12.05),
            new Pens(8, Pens.colorPen.Black, Pens.typePen.BallPoint, "G-Soft", 11.00),
            new Pens(9, Pens.colorPen.Red, Pens.typePen.Highlighters, "Faber Castell", 60.00),
            new Pens(10, Pens.colorPen.Red, Pens.typePen.Marker, "TOUCH", 100.00),
            new Pens(11, Pens.colorPen.Blue, Pens.typePen.Rollerball, "Lancer", 14.75),
            new Pens(12, Pens.colorPen.Black, Pens.typePen.Stylus, "Lancer", 32.00),
    };

    public static Pens[] getAll() {
        return totalPens;
    }

    public static ArrayList<Pens> getByColor(String color) {
        var result = new ArrayList<Pens>();
        for (Pens pen: totalPens) {
            if (pen.getColor().toString().toLowerCase().equals(color.toLowerCase())) {
                result.add(pen);
            }
        }
        return result;
    }

    public static ArrayList<Pens> getByType(String type) {
        var result = new ArrayList<Pens>();
        for (Pens pen: totalPens) {
            if (pen.getType().toString().equalsIgnoreCase(type)) {
                result.add(pen);
            }
        }
        return result;
    }

}
