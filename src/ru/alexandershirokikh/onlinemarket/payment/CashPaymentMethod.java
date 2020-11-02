package ru.alexandershirokikh.onlinemarket.payment;

/**
 * Describes cash payment method
 */
public class CashPaymentMethod implements PaymentMethod {

    @Override
    public Transaction makePayment(Payment payment) {
        return null;
    }

}
