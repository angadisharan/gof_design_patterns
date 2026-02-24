package org.cleancoding.structural.adapter;

public class LegacyPaymentService {

    public void makePayment(double value) {
        System.out.println("Legacy payment processed: " + value);
    }
}