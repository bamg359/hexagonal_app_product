package com.easycode.ddd_hex_product.infraestructure.adapter.output.persistence.mapper;


import com.easycode.ddd_hex_product.domain.model.Category;
import com.easycode.ddd_hex_product.domain.model.Product;
import com.easycode.ddd_hex_product.domain.model.ProductStatus;
import com.easycode.ddd_hex_product.infraestructure.adapter.output.persistence.entity.CategoryEntity;
import com.easycode.ddd_hex_product.infraestructure.adapter.output.persistence.entity.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {




    public ProductEntity toProductEntity(Product product, Category category) {
        return ProductEntity.builder()
                .id(product.getProductId())
                .productName(product.getProductName())
                .price(product.getPrice())
                .quantity(product.getQuantity())
                .status(product.getStatus().toString())
                .build();
    }


    public CategoryEntity toCategoryEntity(Category category){

        return CategoryEntity.builder()
                .id(category.getCategoryId())
                .categoryName(category.getCategoryName())
                .build();
    }


    public Product toProductDomain(ProductEntity productEntity, CategoryEntity categoryEntity) {
        Category category = new Category(categoryEntity.getId(), categoryEntity.getCategoryName());
        ProductStatus status = ProductStatus.valueOf(productEntity.getStatus());
        return new Product(productEntity.getId(), productEntity.getProductName(), productEntity.getQuantity(), productEntity.getPrice(), status, category);
    }


    public Category toCategoryDomain(CategoryEntity categoryEntity){
        return new Category(categoryEntity.getId(), categoryEntity.getCategoryName());
    }






}
