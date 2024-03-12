package com.scaler.productservicesst9mar.services;

import com.scaler.productservicesst9mar.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product getSingleProduct(Long id);

    Product createProduct(Product product);
}