package com.darkcandles.springboot.order;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/order")
    public Order getOrder(@RequestParam Integer id) {
        Optional<Order> order = orderService.getOrder(id);
        if (order.isPresent()) {
            return (Order) order.get();
        }
        return null;
    }
}