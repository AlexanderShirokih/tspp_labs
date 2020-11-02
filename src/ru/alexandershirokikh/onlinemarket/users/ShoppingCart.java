package ru.alexandershirokikh.onlinemarket.users;

import ru.alexandershirokikh.onlinemarket.models.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * A shipping cart containing chosen products
 */
public class ShoppingCart {

    private HashMap<Product, Double> chosenProducts = new HashMap<>();

    /**
     * Returns currently chosen products
     */
    public Map<Product, Double> getProducts() {
        return Map.copyOf(chosenProducts);
    }

    /**
     * Adds the `product` with the `amount`.
     * If product already exits amount will be increased
     */
    public void addProduct(Product product, double amount) {
        Objects.requireNonNull(product);
        chosenProducts.merge(product, amount, Double::sum);
    }

    /**
     * Removes the product from cart
     */
    public void removeProduct(Product product) {
        chosenProducts.remove(product);
    }

    /**
     * Clears the shopping cart
     */
    public void clear() {
        chosenProducts.clear();
    }

}
