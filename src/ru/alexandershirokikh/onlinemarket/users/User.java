package ru.alexandershirokikh.onlinemarket.users;

/**
 * Describes a user that can interact with the system
 */
public abstract class User {

    /**
     * User name
     */
    private String name;

    /**
     * Returns user name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets user name
     */
    public void setName(String name) {
        this.name = name;
    }
}
