package com.observaibility.observability_order_service.service;

import com.observaibility.observability_order_service.dto.CreateOrderRequest;
import com.observaibility.observability_order_service.entity.Order;
import com.observaibility.observability_order_service.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(CreateOrderRequest request) {

        Order order = new Order(
                request.getItemName(),
                request.getPrice(),
                "CREATED"
        );

        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderbyId(Long orderId) {
        return orderRepository.findById(orderId);
    }
}
