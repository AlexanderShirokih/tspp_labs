package ru.alexandershirokikh.onlinemarket.delivery;

import ru.alexandershirokikh.onlinemarket.users.Customer;

import java.util.Date;

/**
 * Describes a delivery request
 */
public class DeliveryRequest {

    public enum Status {
        Created,
        Preparing,
        Manned,
        Cancelled,
        InTransit,
        Delivered
    }

    private String address;
    private Customer owner;
    private Date desiredDate;
    private Status deliveryStatus = Status.Created;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public Date getDesiredDate() {
        return desiredDate;
    }

    public void setDesiredDate(Date desiredDate) {
        this.desiredDate = desiredDate;
    }

    public Status getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(Status deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
