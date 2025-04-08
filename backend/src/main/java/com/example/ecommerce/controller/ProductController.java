package com.example.ecommerce.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @GetMapping
    public List<Map<String, Object>> getAllProducts() {
        return List.of(
            Map.of("id", 1, "name", "Product A", "price", 99.99),
            Map.of("id", 2, "name", "Product B", "price", 149.99)
        );
    }
}