package org.example;

public class Delivery extends Restaurant{
    private static Delivery instance = new Delivery();

    private Delivery() {
    }

    public static Delivery getInstance() {
        return instance;
    }
}
