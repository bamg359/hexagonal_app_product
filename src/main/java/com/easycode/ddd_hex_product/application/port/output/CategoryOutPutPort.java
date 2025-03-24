package com.easycode.ddd_hex_product.application.port.output;

import com.easycode.ddd_hex_product.domain.model.Category;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CategoryOutPutPort {

    Mono<Category> save(Category category);
    Mono<Category> findById(int categoryId);
    Mono<Void> deleteById(int categoryId);
    Mono<Category> update(Category category);
    Flux<Category> findAll();

}
