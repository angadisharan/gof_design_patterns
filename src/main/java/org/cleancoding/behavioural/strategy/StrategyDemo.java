package org.cleancoding.behavioural.strategy;

public class StrategyDemo {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.execute(1000);

        context.setStrategy(new UpiPayment());
        context.execute(500);
    }
}