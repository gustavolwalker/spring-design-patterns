# Spring Design Patterns

Sample app to demonstrate various design patterns implemented in Spring Boot.

The implementation is divided in different packages, each showcasing a specific design pattern.

- [Singleton](#singleton-pattern):
  - com.teste.singleton:
    - SingletonNotificationController: Handles notification sending using a singleton service.
    - EmailService: A singleton service for sending emails.
- [Factory](#factory-pattern):
  - com.teste.factory:
    - FactoryNotificationController: Handles sending notifications using a factory pattern.
    - NotificationFactory: Component that returns the appropriate notification sender based on input.
    - NotificationSender: Interface for sending notifications.
    - EmailSender: Implementation for email notifications.
    - SmsSender: Implementation for SMS notifications.
- [Strategy](#strategy-pattern):
  - com.teste.strategy:
    - StrategyPaymentController: Handles payment processing using a strategy pattern.
    - PatmentProcessor: 
    - PaymentStrategy: Interface for payment strategies.
    - CreditCardPayment: Implementation for credit card payments.
    - PayPalPayment: Implementation for PayPal payments.
- [Observer](#observer-pattern):
  - com.teste.observer:
    - ObserverUserController: Handles user registration and sends notifications.
    - UserService: Service that manages user registrations and notifies observers.
    - UserCreatedEvent: Event that is published when a user is created.
    - EmailListener: Observer that sends an email when a user is created.
- [Decorator](#decorator-pattern):
  - com.teste.decorator:
    - DecoratorReportController: Handles report generation with decorators.
    - ReportService: Interface for generating reports.
    - BaseReportService: Base implementation for report generation.
    - LoggingReportDecorator: Decorator that adds logging to report generation.

## Singleton Pattern

Use Case: Managing service classes with shared state or logic.

Spring Boot handles this automatically by defaulting to singleton scope for beans.

### Example: Notification Service

```bash
curl -X POST "http://localhost:8080/singleton/notification/done" -d "email=to@mail.com"
```

## Factory Pattern

Use Case: Dynamically returning different implementations based on input.

### Example: Notification Factory

```bash
curl -X POST "http://localhost:8080/factory/notification/send"  -d "channel=sms" -d "to=+5555555555"
```

```bash
curl -X POST "http://localhost:8080/factory/notification/send"  -d "channel=email" -d "to=to@mail.com"
```

## Strategy Pattern

Use Case: Replace if/else or switch logic with interchangeable strategies.

### Example: Payment Strategy

```bash
curl -X POST "http://localhost:8080/strategy/payment/pay" -d "amount=100" -d "method=creditCard"
```

```bash
curl -X DELETE "http://localhost:8080/strategy/payment/cancel" -d "transactionId=b0c45f8d-8bdd-4687-b9d6-3f52327e429c" -d "method=creditCard"
```

## Observer Pattern

Use Case: Decouple components that should respond to an event (like user registration).

### Example: User Registration Notification

```bash
curl -X POST "http://localhost:8080/observer/user/create" -d "email=to@mail.com"
```

## Decorator Pattern

Use Case: Add logging, metrics, or extra processing to a service without modifying the original.

### Example: Report Generation with Decorator

```bash
curl -X GET "http://localhost:8080/decorator/report/generate"
```