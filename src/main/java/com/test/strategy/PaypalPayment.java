package com.test.strategy;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component("paypal")
public class PaypalPayment implements PaymentStrategy {

    public UUID pay(double amount) {

        UUID transactionId = UUID.randomUUID();

        System.out.println("Processing PayPal payment " + transactionId + " of amount: " + amount);

        return transactionId;
    }

    @Override
    public void cancel(UUID transactionId) {

        System.out.println("Cancelling PayPal payment with transaction ID: " + transactionId);
    }
}
