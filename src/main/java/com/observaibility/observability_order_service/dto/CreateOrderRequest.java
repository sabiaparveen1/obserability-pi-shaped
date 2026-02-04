package com.observaibility.observability_order_service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateOrderRequest {

    private String itemName;
    private double price;
}
