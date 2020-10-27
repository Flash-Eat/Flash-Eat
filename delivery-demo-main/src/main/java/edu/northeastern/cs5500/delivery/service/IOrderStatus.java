package edu.northeastern.cs5500.delivery.service;

import edu.northeastern.cs5500.delivery.model.Dish;
import edu.northeastern.cs5500.delivery.model.Order;

import java.util.List;

public interface IOrderStatus {

    void addOrderToCart (String customerId, String restaurantId, List<Dish> dishes);

    void cancelOrder (String customerId);

    void checkOutOrder (String customerId);

    Order getOrder (String customerId);

    // boolean orderAccepted (String customerId, String restaurantId);

    boolean orderReady (String customerId, String restaurantId);

}
