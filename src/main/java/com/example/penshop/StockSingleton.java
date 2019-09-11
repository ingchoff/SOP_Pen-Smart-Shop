package com.example.penshop;

import java.io.*;
import java.util.ArrayList;

public class StockSingleton {
    private Horse[] totalHorse;
    private Gsoft[] totalG;
    private static StockSingleton instance;

    private StockSingleton() {
    }

    public static StockSingleton getInstance() {
        if (instance == null) {
            instance = new StockSingleton();
        }
        return instance;
    }

    public void setTotalHorse(Horse[] totalHorse) {
        this.totalHorse = totalHorse;
    }

    public void setTotalG(Gsoft[] totalG) {
        this.totalG = totalG;
    }

    public void createFileStock(String fileName) throws IOException {
        var result = new ArrayList<>();
        for (Horse horse: totalHorse) {
            result.add(horse);
        }
        for (Gsoft gsoft: totalG) {
            result.add(gsoft);
        }
        FileOutputStream stockFile = new FileOutputStream(new File(fileName));
        ObjectOutputStream dataOut = new ObjectOutputStream(stockFile);
        dataOut.writeObject(result);
        stockFile.close();
        dataOut.close();
    }

    public Object readFileStock(String filename) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(new File(filename));
        ObjectInputStream ois = new ObjectInputStream(fileInputStream);
        Object stock = ois.readObject();
        ois.close();
        fileInputStream.close();
        return stock;
    }
}
