package ru.alexandershirokikh.onlinemarket.services.filters;

import ru.alexandershirokikh.onlinemarket.models.Product;

import java.util.Arrays;
import java.util.Objects;

/**
 * Used to filter products by several filters
 */
public class ProductMultiFilter implements ProductFilter {

    private final ProductFilter[] filters;

    /**
     * Creates filters that passes products that are accepted by all filters.
     */
    public ProductMultiFilter(ProductFilter[] filters) {
        Objects.requireNonNull(filters);
        this.filters = filters;
    }

    @Override
    public boolean accept(Product product) {
        return Arrays.stream(filters).allMatch(filter -> filter.accept(product));
    }
}
