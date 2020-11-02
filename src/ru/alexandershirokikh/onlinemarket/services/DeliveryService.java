package ru.alexandershirokikh.onlinemarket.services;

import ru.alexandershirokikh.onlinemarket.delivery.DeliveryRequest;

import java.util.stream.Stream;

/**
 * A service for managing a delivery
 */
public interface DeliveryService {

    /**
     * Gets all deliveries
     */
    Stream<DeliveryRequest> getDeliveries();

    /**
     * Adds a new request to delivery list
     */
    void addDelivery(DeliveryRequest request);

    /**
     * Removes delivery request from delivery list
     */
    void removeDelivery(DeliveryRequest request);
}
