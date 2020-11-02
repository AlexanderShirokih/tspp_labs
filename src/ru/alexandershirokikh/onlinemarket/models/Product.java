package ru.alexandershirokikh.onlinemarket.models;

import java.util.List;

/**
 * Describes single product information
 */
public class Product {
    /**
     * Unique product ID. Identifies product in the storage
     */
    private final long id;

    /**
     * Displayed product name
     */
    private String name;

    /**
     * Displayed product description
     */
    private String description;

    /**
     * Associated product category
     */
    private String category;

    /**
     * A list of currently set properties
     */
    private final List<ProductProperty<?>> productProperties;

    public Product(long id, List<ProductProperty<?>> productProperties) {
        this.id = id;
        this.productProperties = productProperties;
    }

    /**
     * Returns the product ID
     */
    public long getId() {
        return id;
    }

    /**
     * Returns the product name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the product name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the product description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the product description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the product category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the product category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Returns a list of the product properties
     */
    public List<ProductProperty<?>> getProductProperties() {
        return productProperties;
    }


    /**
     * Returns current price of the product
     *
     * @throws IllegalStateException if product doesn't have 'price' property in it's properties list
     * @throws ClassCastException    is "price" type is not Double
     */
    double getPrice() {
        return productProperties.stream()
                .filter(prop -> prop.getKey().equals("price"))
                .findFirst()
                .map(prop -> (Double) prop.value)
                .orElseThrow(() -> new IllegalStateException("Price property is not present"));
    }
}
