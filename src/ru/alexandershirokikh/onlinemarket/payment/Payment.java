package ru.alexandershirokikh.onlinemarket.payment;

import ru.alexandershirokikh.onlinemarket.users.Customer;

import java.util.Objects;

/**
 * Describes payment info with certain total amount
 */
public class Payment {

    public enum Status {
        Unpaid,
        Approving,
        Paid,
        Rejected,
        Cancelled
    }

    private final double totalAmount;

    private final Customer owner;

    private Status paymentStatus = Status.Unpaid;

    private Transaction transaction;

    /**
     * Creates new payment with specified totalAmount and owner
     */
    public Payment(Customer owner, double totalAmount) {
        Objects.requireNonNull(owner);
        this.totalAmount = totalAmount;
        this.owner = owner;
    }

    /**
     * Gets underlying transaction if payment status is not `Unpaid`
     */
    public Transaction getTransaction() {
        return transaction;
    }

    /**
     * Returns the total amount of the payment
     */
    public double getTotalAmount() {
        return totalAmount;
    }
}
