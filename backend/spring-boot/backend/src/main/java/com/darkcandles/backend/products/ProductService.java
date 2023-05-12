package com.darkcandles.backend.products;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
  private final ProductRepository productRepository;

  public List<Product> getAllProducts() {
    return productRepository.findAll();
  }

  public List<Product> getProductsByType(Character productType) {
    return productRepository.findProductsByProductType(productType);
  }

  public Product getProductById(String id) {
    return productRepository.findProductById(id).orElseThrow(() -> new RuntimeException("Product not found"));
  }

  public Product createProduct(Product product) {
    return productRepository.save(product);
  }
}
