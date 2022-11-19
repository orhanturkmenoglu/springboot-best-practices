package com.example.springbootbestpractices.controller;

import com.example.springbootbestpractices.dto.ProductResponseDTO;
import com.example.springbootbestpractices.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
@Slf4j
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductResponseDTO>> getAllProducts() {
        log.info("ProductController::getAllProducts () started");
        List<ProductResponseDTO> getAllProducts = productService.getAllProducts();
        log.info("ProductController::getAllProducts () finished");
        return ResponseEntity.ok().body(getAllProducts);
    }
}
