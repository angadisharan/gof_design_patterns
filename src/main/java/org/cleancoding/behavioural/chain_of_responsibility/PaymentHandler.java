package org.cleancoding.behavioural.chain_of_responsibility;

abstract class PaymentHandler {

    protected PaymentHandler next;

    public void setNext(PaymentHandler next) {
        this.next = next;
    }

    public void handle(String orderId) {

        process(orderId);

        if(next != null) {
            next.handle(orderId);
        }
    }

    protected abstract void process(String orderId);
}