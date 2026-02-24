package org.cleancoding.behavioural.observer;

public class ObserverDemo {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        paymentService.addObserver(new SmsService());
        paymentService.addObserver(new EmailService());
        paymentService.addObserver(new NotificationService());

        paymentService.processPayment("ORD-101");
    }
}