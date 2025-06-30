package com.test.strategy;

import java.util.UUID;

public interface PaymentStrategy {

    UUID pay(double amount);

    void cancel(UUID transactionId);
}
