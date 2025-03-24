package com.easycode.ddd_hex_product.infraestructure.adapter.output.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("categories")
@Data
@Builder
@AllArgsConstructor
public class CategoryEntity {

    @Id
    private int id;
    private String categoryName;



}
