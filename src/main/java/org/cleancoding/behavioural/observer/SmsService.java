package org.cleancoding.behavioural.observer;

public class SmsService implements PaymentObserver {

    public void update(String orderId) {
        System.out.println("SMS sent for order: " + orderId);
    }
}