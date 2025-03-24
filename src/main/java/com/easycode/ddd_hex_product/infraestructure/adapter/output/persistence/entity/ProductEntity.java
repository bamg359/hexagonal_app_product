package com.easycode.ddd_hex_product.infraestructure.adapter.output.persistence.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("products")
@Data
@Builder
@AllArgsConstructor
public class ProductEntity {

    @Id
    private int id;
    private String productName;
    private int quantity;
    private double price;
    private String status;



}
