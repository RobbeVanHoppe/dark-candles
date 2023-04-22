package com.darkcandles.springboot.order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private List<Order> orderList;

    public OrderService() {
        orderList = new ArrayList<>();

        Order order1 = new Order(0, 1, 2);
        Order order2 = new Order(1, 1, 1);
        Order order3 = new Order(2, 1, 3);

        orderList.addAll(Arrays.asList(order1, order2, order3));
    }

    public Optional<Order> getOrder(Integer id) {
        Optional<Order> optional = Optional.empty();
        for (Order order: orderList) {
            if (id == order.getOrderID()) {
                optional = Optional.of(order);
            }
        }
        return optional;
    }
}