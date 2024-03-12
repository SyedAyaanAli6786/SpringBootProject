package com.scaler.productservicesst9mar.controllers;

import com.scaler.productservicesst9mar.models.Product;
import com.scaler.productservicesst9mar.services.FakeStoreProductService;
import com.scaler.productservicesst9mar.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

// 1. Tell spring this is a special class
//    so automatically create an object of
//    it and inject dependencies if needed
// 2. Tell spring that this class has methods
//    that may need to be called if our server
//    receives a request at particular endpoint
@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World";
    }


    @GetMapping("/sing")
    public String sayShavaShava() {
        return "Shava Shava";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return new ArrayList<>();
    }


    @GetMapping("/products/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id) {

        return productService.getSingleProduct(id);
    }

//    @PostMapping("/products")
//    public Product createProduct(@RequestParam("title") String title,
//                                 @RequestParam("description") String description) {
//        return new Product();
//    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        return null;
    }

    