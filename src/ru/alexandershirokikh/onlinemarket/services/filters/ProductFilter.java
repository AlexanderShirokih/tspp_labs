package ru.alexandershirokikh.onlinemarket.services.filters;

import ru.alexandershirokikh.onlinemarket.models.Product;

/**
 * An interface used to filter products by some categories
 */
public interface ProductFilter {

    /**
     * Returns `true` if `product` passes the filter,
     * `false` otherwise
     */
    public boolean accept(Product product);

}
