package ru.alexandershirokikh.onlinemarket.models;

import ru.alexandershirokikh.onlinemarket.payment.Payment;
import ru.alexandershirokikh.onlinemarket.users.Customer;

import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Describes an order
 */
public class Order {

    /**
     * Order states
     */
    public enum Status {
        Created,
        Approved,
        Completed,
        Cancelled,
    }

    private final Date date = new Date();

    private Status orderStatus = Status.Created;

    private final Map<Product, Double> products;

    private final Customer owner;

    /**
     * Creates an order containing given product list
     */
    public Order(Customer owner, Map<Product, Double> products) {
        Objects.requireNonNull(owner);
        Objects.requireNonNull(products);

        this.owner = owner;
        this.products = products;
    }

    /**
     * Creates payment for used products
     */
    Payment createPayment() {
        double totalAmount = products.entrySet()
                .stream()
                .collect(Collectors.summarizingDouble(p -> p.getKey().getPrice() * p.getValue()))
                .getSum();

        return new Payment(owner, totalAmount);
    }

    /**
     * Returns order creation date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Returns current order status
     */
    public Status getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets current order status
     */
    public void setOrderStatus(Status orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * Gets unmodifiable map of products
     */
    public Map<Product, Double> getProducts() {
        return Map.copyOf(products);
    }

    /**
     * Returns order owner
     */
    public Customer getOwner() {
        return owner;
    }
}
