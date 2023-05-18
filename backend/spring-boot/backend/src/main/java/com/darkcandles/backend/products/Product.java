package com.darkcandles.backend.products;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
@NoArgsConstructor
public abstract class Product {
  @Id
  private String id;
  private ProductType productType;
  private String description;
  private Integer stock;
  private Double price;
  private LocalDateTime created;

  public Product(ProductType productType, String description, Integer stock, Double price, LocalDateTime created) {
    this.productType = productType;
    this.description = description;
    this.stock = stock;
    this.price = price;
    this.created = created;
  }
}
