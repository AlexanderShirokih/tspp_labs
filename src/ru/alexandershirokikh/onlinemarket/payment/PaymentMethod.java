package ru.alexandershirokikh.onlinemarket.payment;

/**
 * Describes an abstract payment method for doing payments
 */
public interface PaymentMethod {

    /**
     * Does the payment and returns the transaction
     */
    Transaction makePayment(Payment payment);

}
