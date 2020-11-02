package ru.alexandershirokikh.onlinemarket.users;

import ru.alexandershirokikh.onlinemarket.models.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines a user that can buy come products
 */
public class Customer extends User {

    private List<Order> orders = new ArrayList<>();
    private ShoppingCart shoppingCart = new ShoppingCart();

    /**
     * Creates new order of shopping cart content
     */
    public Order createOrder() {
        Order order = new Order(this, shoppingCart.getProducts());
        orders.add(order);
        shoppingCart.clear();

        return order;
    }

    /**
     * Gets all user orders
     */
    public List<Order> getOrders() {
        return orders;
    }
}
