package ru.alexandershirokikh.onlinemarket.services.filters;

import ru.alexandershirokikh.onlinemarket.models.Product;

import java.util.Objects;

/**
 * Filters products by name or description
 */
public class NameProductFilter implements ProductFilter {
    private final String filterPattern;

    /**
     * Creates filter that only accepts product that contains `filterPattern`
     * in it's name or description
     */
    public NameProductFilter(String filterPattern) {
        Objects.requireNonNull(filterPattern);
        this.filterPattern = filterPattern;
    }

    @Override
    public boolean accept(Product product) {
        return product.getName().contains(filterPattern) ||
                product.getDescription().contains(filterPattern);
    }
}
