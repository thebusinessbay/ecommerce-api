package com.businessbay.ecommerce.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @GetMapping("/api/products")
    String getProducts() {
        return "Hello World!";
    }
}
