package org.cleancoding.behavioural.chain_of_responsibility;

class NotificationHandler extends PaymentHandler {

    protected void process(String orderId) {
        System.out.println("Sending notification: " + orderId);
    }
}