package com.design.patterns.strategy;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component("creditCard")
public class CreditCardPayment implements PaymentStrategy {

    public UUID pay(double amount) {

        UUID transactionId = UUID.randomUUID();

        System.out.println("Processing credit card payment " + transactionId + " of amount: " + amount);

        return transactionId;
    }

    @Override
    public void cancel(UUID transactionId) {

        System.out.println("Cancelling credit card payment with transaction ID: " + transactionId);
    }
}
