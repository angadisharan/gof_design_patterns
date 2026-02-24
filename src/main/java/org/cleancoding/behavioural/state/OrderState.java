package org.cleancoding.behavioural.state;

public interface OrderState {

    void next(OrderContext context);

    void printStatus();
}