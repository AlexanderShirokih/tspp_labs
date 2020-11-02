package ru.alexandershirokikh.onlinemarket.users;

import ru.alexandershirokikh.onlinemarket.models.Order;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

/**
 * Describes a worker that can sell products
 */
public class Seller extends User {

    private final Duration workingExperience;

    private final List<Order> ownedOrders;

    /**
     * Creates new seller with workingExperience and initial ownerOrders
     */
    public Seller(Duration workingExperience, List<Order> ownedOrders) {
        Objects.requireNonNull(workingExperience);
        Objects.requireNonNull(ownedOrders);
        this.workingExperience = workingExperience;
        this.ownedOrders = ownedOrders;
    }

    /**
     * Returns current working experience
     */
    public Duration getWorkingExperience() {
        return workingExperience;
    }

    /**
     * Returns orders approved by the seller
     */
    public List<Order> getOwnedOrders() {
        return ownedOrders;
    }


}
