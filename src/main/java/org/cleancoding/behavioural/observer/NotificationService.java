package org.cleancoding.behavioural.observer;

public class NotificationService implements PaymentObserver {

    public void update(String orderId) {
        System.out.println("Push notification sent for order: " + orderId);
    }
}