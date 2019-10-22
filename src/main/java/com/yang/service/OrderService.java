package com.yang.service;

import com.yang.domain.Order;
import com.yang.domain.OrderItem;

import java.util.List;

public interface OrderService {
    String waitPay = "waitPay";
    String waitDelivery = "waitDelivery";
    String waitConfirm = "waitConfirm";
    String waitReview = "waitReview";
    String finish = "finish";
    String delete = "delete";

    void add(Order order);
    void update(Order order);
    void delete(int id);
    Order get(int id);
    List<Order> list();
    List<Order> list(int uid, String excludedStatus);

    float add(Order order, List<OrderItem> ois);
}
