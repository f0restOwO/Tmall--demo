package com.yang.service;

import com.yang.domain.Order;
import com.yang.domain.OrderItem;

import java.util.List;

public interface OrderItemService {
    void add(OrderItem orderItem);
    void delete(int id);
    void update(OrderItem order);

    OrderItem get(int id);
    List<OrderItem> list();
    void fill(List<Order> orders);
    void fill(Order order);
    int getSaleCount(int pid);
    List<OrderItem> listByUser(int uid);
}
