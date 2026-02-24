package org.cleancoding.behavioural.state;

public class PaidState implements OrderState {

    public void next(OrderContext context) {
        context.setState(new ShippedState());
    }

    public void printStatus() {
        System.out.println("Order Paid");
    }
}