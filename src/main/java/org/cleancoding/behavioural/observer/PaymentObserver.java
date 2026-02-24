package org.cleancoding.behavioural.observer;

public interface PaymentObserver {

    void update(String orderId);
}