package com.easycode.ddd_hex_product.infraestructure.adapter.output.persistence.repository;

import com.easycode.ddd_hex_product.infraestructure.adapter.output.persistence.entity.CategoryEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

public interface CategoryRepository extends R2dbcRepository<CategoryEntity, Integer> {
    Flux<CategoryEntity> findAllByCategoryId(int categoryId);
}
