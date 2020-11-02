package ru.alexandershirokikh.onlinemarket.services;

import ru.alexandershirokikh.onlinemarket.models.Product;
import ru.alexandershirokikh.onlinemarket.services.filters.ProductFilter;

import java.util.List;

/**
 * A service used to access products list
 */
public interface ProductService {

    /**
     * Gets products filtering by filter and sorted by sorter
     */
    List<Product> getProducts(ProductFilter filter);

    /**
     * Adds product to the product storage
     */
    void addProduct(Product product);

}
