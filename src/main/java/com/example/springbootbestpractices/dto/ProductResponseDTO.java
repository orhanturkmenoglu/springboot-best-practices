package com.example.springbootbestpractices.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductResponseDTO {

    private String name;
    private String description;
    private String productType;
    private int quantity;
    private BigDecimal price;
    private String supplierName;
    private String supplierCode;
}
