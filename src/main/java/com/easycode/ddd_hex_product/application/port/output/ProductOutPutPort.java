package com.easycode.ddd_hex_product.application.port.output;

import com.easycode.ddd_hex_product.domain.model.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductOutPutPort {


    Mono<Product> save(Product product);
    Mono<Product> findById(int productId);
    Flux<Product> findAll();
    Mono<Void> deleteById(int productId);
    Mono<Product> update(Product product);


}
