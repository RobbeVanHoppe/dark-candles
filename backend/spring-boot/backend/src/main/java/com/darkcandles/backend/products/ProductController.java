package com.darkcandles.backend.products;

import lombok.AllArgsConstructor;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {
  private final ProductService productService;

  @GetMapping()
  public List<Product> fetchAllProducts() {
    return productService.getAllProducts();
  }

  @GetMapping("/type/{productType}")
  public List<Product> fetchProductsByType(@PathVariable ProductType productType) {
    return productService.getProductsByType(productType);
  }

  @GetMapping("/id/{id}")
  public Product fetchProductById(String id) {
    return productService.getProductById(id);
  }

  @PostMapping("/create")
  public Product createProduct(Product product) {
    return productService.createProduct(product);
  }
}
