package org.example;

public class Kitchen extends Restaurant{
    private static Kitchen instance = new Kitchen();

    private Kitchen() {
    }

    public static Kitchen getInstance() {
        return instance;
    }
}
