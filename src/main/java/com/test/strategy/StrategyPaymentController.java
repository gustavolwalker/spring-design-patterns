package com.test.strategy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/strategy/payment")
public class StrategyPaymentController {

    private final PaymentProcessor processor;

    public StrategyPaymentController(PaymentProcessor processor) {
        this.processor = processor;
    }

    @PostMapping("/pay")
    public ResponseEntity<String> pay(@RequestParam String method, @RequestParam double amount) {

        UUID transactionID = processor.processPayment(method, amount);

        return ResponseEntity.ok("Payment processed successfully with transaction ID: " + transactionID);
    }

    @DeleteMapping("/cancel")
    public ResponseEntity<String> cancel(@RequestParam String method, @RequestParam String transactionId) {

        processor.processCancelation(method, UUID.fromString(transactionId));

        return ResponseEntity.ok("Payment canceled successfully for transaction ID: " + transactionId);
    }
}
