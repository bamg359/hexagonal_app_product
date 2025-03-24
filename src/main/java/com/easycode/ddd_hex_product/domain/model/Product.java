package com.easycode.ddd_hex_product.domain.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {


    private Integer productId;
    private String productName;
    private Integer quantity;
    private Double price;
    private ProductStatus status;
    private Category category;





}
