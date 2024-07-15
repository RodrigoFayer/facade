package org.example;

public class Payment extends Restaurant{
    private static Payment instance = new Payment();

    private Payment() {
    }

    public static Payment getInstance() {
        return instance;
    }
}
