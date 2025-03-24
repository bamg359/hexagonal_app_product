package com.easycode.ddd_hex_product.infraestructure.adapter.output.persistence.repository;

import com.easycode.ddd_hex_product.infraestructure.adapter.output.persistence.entity.ProductEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface ProductRepository extends R2dbcRepository<ProductEntity, Integer> {
}
