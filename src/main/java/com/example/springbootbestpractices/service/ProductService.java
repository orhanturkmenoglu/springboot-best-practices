package com.example.springbootbestpractices.service;

import com.example.springbootbestpractices.dto.ProductResponseDTO;
import com.example.springbootbestpractices.entity.Product;
import com.example.springbootbestpractices.mapper.ProductMapper;
import com.example.springbootbestpractices.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public List<ProductResponseDTO> getAllProducts() {
        log.info("ProductService::getAllProducts() started");
        List<Product> productList = productRepository.findAll();
        log.info("ProductService::getAllProducts() finished");
        return productMapper.mapToProductResponseDTO(productList);
    }
}
