package ru.alexandershirokikh.onlinemarket.payment;

import java.util.Random;

/**
 * Creates payment transaction
 */
public class Transaction {

    private final long transactionId;

    public Transaction() {
        transactionId = new Random().nextLong();
    }

    public long getTransactionId() {
        return transactionId;
    }

}
