package org.cleancoding.behavioural.chain_of_responsibility;

class ValidationHandler extends PaymentHandler {

    protected void process(String orderId) {
        System.out.println("Validating order: " + orderId);
    }
}