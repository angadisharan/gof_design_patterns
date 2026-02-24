package org.cleancoding.behavioural.chain_of_responsibility;

class FraudHandler extends PaymentHandler {

    protected void process(String orderId) {
        System.out.println("Fraud check: " + orderId);
    }
}