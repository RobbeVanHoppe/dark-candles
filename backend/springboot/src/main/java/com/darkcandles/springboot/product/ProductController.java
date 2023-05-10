package com.darkcandles.springboot.product;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


@RestController
public class ProductController {
  private final ProductService productService;

  @Autowired
  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping("/product/{id}")
  public ResponseEntity<Product> GetProduct(@PathVariable("id") Integer id) {
    Optional<Product> product = productService.GetProduct(id);

    if (product.isPresent()) return ResponseEntity.ok(product.get());
    else throw new ResponseStatusException(HttpStatus.NOT_FOUND);
  }

  @GetMapping("/products")
  public ResponseEntity<List<Product>> GetAllProducts() {
    List<Product> productList = productService.GetAllProducts();

    return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);
    }
  }
