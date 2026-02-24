package org.cleancoding.structural.adapter;

public class PaymentAdapter implements PaymentProcessor {

    private LegacyPaymentService legacyService;

    public PaymentAdapter(LegacyPaymentService legacyService) {
        this.legacyService = legacyService;
    }

    @Override
    public void pay(double amount) {
        legacyService.makePayment(amount);
    }
}