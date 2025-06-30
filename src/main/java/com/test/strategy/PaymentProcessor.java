package com.test.strategy;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.UUID;

@Component
public class PaymentProcessor {

    private final Map<String, PaymentStrategy> strategies;

    public PaymentProcessor(Map<String, PaymentStrategy> strategies) {
        this.strategies = strategies;
    }

    public UUID processPayment(String method, double amount) {

        UUID transactionId = strategies.get(method).pay(amount);

        System.out.println("Payment processed with transaction ID: " + transactionId);
        return transactionId;
    }

    public void processCancelation(String method, UUID transactionId) {

        strategies.get(method).cancel(transactionId);

        System.out.println("Payment canceled for transaction ID: " + transactionId);
    }

}
