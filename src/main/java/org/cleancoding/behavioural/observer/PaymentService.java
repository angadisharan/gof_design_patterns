package org.cleancoding.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class PaymentService {

    private List<PaymentObserver> observers = new ArrayList<>();

    public void addObserver(PaymentObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(PaymentObserver observer) {
        observers.remove(observer);
    }

    public void processPayment(String orderId) {

        System.out.println("Payment successful for order: " + orderId);

        notifyObservers(orderId);
    }

    private void notifyObservers(String orderId) {

        for (PaymentObserver observer : observers) {
            observer.update(orderId);
        }
    }
}