package org.cleancoding.behavioural.chain_of_responsibility;

public class ChainDemo {

    public static void main(String[] args) {

        PaymentHandler validation = new ValidationHandler();
        PaymentHandler fraud = new FraudHandler();
        PaymentHandler notify = new NotificationHandler();

        validation.setNext(fraud);
        fraud.setNext(notify);

        validation.handle("ORD-300");
    }
}