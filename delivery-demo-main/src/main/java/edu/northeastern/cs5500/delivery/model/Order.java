package edu.northeastern.cs5500.delivery.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Order {

    private String customerId;
    private String restaurantId;
    private String driverId;
    private LocalDateTime deliveryStart;
    private LocalDateTime deliveryEnd;
    private List<Dish> dishList;
    private double totalPrice;

    public Order(String customerId, String restaurantId, String driverId, LocalDateTime deliveryStart,
                 LocalDateTime deliveryEnd, List<Dish> dishList, double totalPrice) {
        this.customerId = customerId;
        this.restaurantId = restaurantId;
        this.driverId = driverId;
        this.deliveryStart = deliveryStart;
        this.deliveryEnd = deliveryEnd;
        this.dishList = dishList;
        this.totalPrice = totalPrice;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public LocalDateTime getDeliveryStart() {
        return deliveryStart;
    }

    public void setDeliveryStart(LocalDateTime deliveryStart) {
        this.deliveryStart = deliveryStart;
    }

    public LocalDateTime getDeliveryEnd() {
        return deliveryEnd;
    }

    public void setDeliveryEnd(LocalDateTime deliveryEnd) {
        this.deliveryEnd = deliveryEnd;
    }

    public List<Dish> getDishList() {
        return dishList;
    }

    public void setDishList(List<Dish> dishList) {
        this.dishList = dishList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.totalPrice, totalPrice) == 0 && Objects.equals(customerId, order.customerId)
                && Objects.equals(restaurantId, order.restaurantId) && Objects.equals(driverId, order.driverId)
                && Objects.equals(deliveryStart, order.deliveryStart) && Objects.equals(deliveryEnd, order.deliveryEnd)
                && Objects.equals(dishList, order.dishList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, restaurantId, driverId, deliveryStart, deliveryEnd, dishList, totalPrice);
    }

    @Override
    public String toString() {
        return "Order{" +
                "customerId='" + customerId + '\'' +
                ", restaurantId='" + restaurantId + '\'' +
                ", driverId='" + driverId + '\'' +
                ", deliveryStart=" + deliveryStart +
                ", deliveryEnd=" + deliveryEnd +
                ", dishList=" + dishList +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
