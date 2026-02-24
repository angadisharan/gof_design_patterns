package org.cleancoding.behavioural.observer;

public class EmailService implements PaymentObserver {

    public void update(String orderId) {
        System.out.println("Email sent for order: " + orderId);
    }
}