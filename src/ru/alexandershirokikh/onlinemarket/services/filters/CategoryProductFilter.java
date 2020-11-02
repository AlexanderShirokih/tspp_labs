package ru.alexandershirokikh.onlinemarket.services.filters;

import ru.alexandershirokikh.onlinemarket.models.Product;

import java.util.List;
import java.util.Objects;

/**
 * Filters products by defined categories
 */
public class CategoryProductFilter implements ProductFilter {

    private final List<String> acceptedCategories;

    /**
     * Creates the filter that accepts only given categories
     */
    public CategoryProductFilter(List<String> acceptedCategories) {
        Objects.requireNonNull(acceptedCategories);
        this.acceptedCategories = acceptedCategories;
    }

    @Override
    public boolean accept(Product product) {
        return acceptedCategories.stream()
                .anyMatch(cat -> cat.equals(product.getCategory()));
    }

}
