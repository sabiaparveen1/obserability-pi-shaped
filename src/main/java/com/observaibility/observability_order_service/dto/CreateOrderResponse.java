package com.observaibility.observability_order_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CreateOrderResponse {

    private Long orderId;
    private String status;
}
