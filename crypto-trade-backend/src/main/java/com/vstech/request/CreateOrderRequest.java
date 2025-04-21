package com.vstech.request;

import lombok.Data;

import java.math.BigDecimal;

import com.vstech.domain.OrderType;
import com.vstech.model.Coin;


@Data
public class CreateOrderRequest {
    private String coinId;
    private double quantity;
    private OrderType orderType;
}
