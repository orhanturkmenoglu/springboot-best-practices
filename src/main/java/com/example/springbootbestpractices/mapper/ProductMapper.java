package com.example.springbootbestpractices.mapper;

import com.example.springbootbestpractices.dto.ProductRequestDTO;
import com.example.springbootbestpractices.dto.ProductResponseDTO;
import com.example.springbootbestpractices.entity.Product;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductMapper {

    public List<ProductResponseDTO> mapToProductResponseDTO(List<Product> productList) {

        return productList.stream()
                .map(this::mapToProduct)
                .collect(Collectors.toList());
    }

    public ProductResponseDTO mapToProduct(Product product) {

        return ProductResponseDTO.builder()
                .name(product.getName())
                .description(product.getDescription())
                .productType(product.getProductType())
                .price(product.getPrice())
                .supplierCode(product.getSupplierCode())
                .supplierName(product.getSupplierName())
                .quantity(product.getQuantity())
                .build();
    }
}
