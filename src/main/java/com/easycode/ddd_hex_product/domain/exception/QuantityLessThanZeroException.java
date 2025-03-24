package com.easycode.ddd_hex_product.domain.exception;

public class QuantityLessThanZeroException extends RuntimeException {
    public QuantityLessThanZeroException(String message) {
        super(message);
    }
}
