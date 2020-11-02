package ru.alexandershirokikh.onlinemarket.services;

import ru.alexandershirokikh.onlinemarket.payment.Payment;
import ru.alexandershirokikh.onlinemarket.payment.PaymentMethod;
import ru.alexandershirokikh.onlinemarket.users.Customer;

import java.util.stream.Stream;

/**
 * A service that manages payments
 */
public interface PaymentService {

    /**
     * Returns the recent payments
     */
    Stream<Payment> getRecentPayments();

    /**
     * Returns payments made by customer
     */
    Stream<Payment> getPayments(Customer owner);

    /**
     * Makes the payment transaction
     */
    void makePayment(Payment payment, PaymentMethod paymentMethod);

}
