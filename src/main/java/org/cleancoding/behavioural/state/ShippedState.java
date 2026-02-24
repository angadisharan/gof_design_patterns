package org.cleancoding.behavioural.state;

public class ShippedState implements OrderState {

    public void next(OrderContext context) {
        System.out.println("Order Delivered");
    }

    public void printStatus() {
        System.out.println("Order Shipped");
    }
}