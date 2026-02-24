package org.cleancoding.structural.adapter;

public class AdapterDemo {

    public static void main(String[] args) {

        LegacyPaymentService legacy = new LegacyPaymentService();

        PaymentProcessor processor = new PaymentAdapter(legacy);

        processor.pay(500);
    }
}