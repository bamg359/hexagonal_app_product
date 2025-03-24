package com.easycode.ddd_hex_product.domain.model;

import lombok.Getter;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;


public class ProductData {


    private final Integer quantity;


    public ProductData(Integer quantity) {

        if (quantity < 0) {
            throw new RuntimeException("Quantity cannot be negative");
        }
        this.quantity = quantity;
    }



    public Integer getQuantity() {
        return quantity;
    }


}
