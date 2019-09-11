package com.example.penshop;

import java.io.IOException;
import java.util.ArrayList;

public class PensFactory {
    public static Horse[] totalHorse = new Horse[]{
            new Horse("Red", "BallPoint", 14.00),
            new Horse("Black", "Gel", 22.00),
            new Horse("Blue", "Marker", 35.00),
            new Horse("Black", "BallPoint", 12.50)
    };
    public static Gsoft[] totalG = new Gsoft[]{
            new Gsoft("Red", "BallPoint", 11.00),
            new Gsoft("Blue", "Rollerball", 20.00),
            new Gsoft("Blue", "Gel", 25.00),
            new Gsoft("Black", "Stylus", 112.50)
    };

    public static ArrayList getAll() {
        var totalPens = new ArrayList<>();
        for (Horse horse: totalHorse) {
            totalPens.add((horse));
        }
        for (Gsoft gsoft: totalG) {
            totalPens.add((gsoft));
        }
        return totalPens;
    }

    public static ArrayList getByColor(String color) {
        var result = new ArrayList<>();
        for (Horse horse: totalHorse) {
            if (horse.getColor().equalsIgnoreCase(color)) {
                result.add(horse);
            }
        }
        for (Gsoft gsoft: totalG) {
            if (gsoft.getColor().equalsIgnoreCase(color)) {
                result.add(gsoft);
            }
        }
        return result;
    }

    public static ArrayList getByType(String type) {
        var result = new ArrayList<>();
        for (Horse horse: totalHorse) {
            if (horse.getType().equalsIgnoreCase(type)) {
                result.add(horse);
            }
        }
        for (Gsoft gsoft: totalG) {
            if (gsoft.getType().equalsIgnoreCase(type)) {
                result.add(gsoft);
            }
        }
        return result;
    }

    public static ArrayList getStock() throws IOException, ClassNotFoundException {
        StockSingleton.getInstance().setTotalHorse(totalHorse);
        StockSingleton.getInstance().setTotalG(totalG);
        StockSingleton.getInstance().createFileStock("stock.txt");
        Object txtStock = StockSingleton.getInstance().readFileStock("stock.txt");
        System.out.print(txtStock);
        return (ArrayList) txtStock;
    }

}
