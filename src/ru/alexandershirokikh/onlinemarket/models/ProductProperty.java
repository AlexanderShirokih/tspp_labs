package ru.alexandershirokikh.onlinemarket.models;

/**
 * A class describing arbitrary properties of a product,
 * such as color, price, weight, or anything
 */
public class ProductProperty<T> {
    /**
     * A key of the property used to identify them in the property list
     */
    private final String key;
    /**
     * Displayed name of the property
     */
    private String name;

    /**
     * Displayed description of the property
     */
    private String description;

    /**
     * The property value
     */
    protected T value;

    /**
     * Creates new instance by specifying key
     */
    public ProductProperty(String key) {
        this.key = key;
    }

    /**
     * Returns the property key
     */
    public String getKey() {
        return key;
    }

    /**
     * Returns the property name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the property description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the property description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the property value
     */
    public T getValue() {
        return value;
    }

    /**
     * Returns the property value
     */
    public void setValue(T value) {
        this.value = value;
    }
}
