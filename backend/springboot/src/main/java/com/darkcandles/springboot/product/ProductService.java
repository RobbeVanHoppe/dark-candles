package com.darkcandles.springboot.product;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {
  private final List<Product> productList;

  public ProductService() {
    this.productList = new ArrayList<>();

    Candle candle1 = new Candle(1, 'C', "Kaars met bolletjes", 30, 25.95, "Zwart", "Kubus");
    Candle candle2 = new Candle(2, 'C', "Kaars met hartjes", 25, 19.95, "Rood", "Tetraëder");
    ToteBag toteBag1 = new ToteBag(3, 'T', "Linnen totebag met tekening", 50, 12.95, "Het leven is geen ponykamp", "Linnen");
    ToteBag toteBag2 = new ToteBag(4, 'T', "Linnen totebag met tekening", 50, 12.95, "Het leven is geen ponykamp", "Linnen");
    RoomSpray roomSpray1 = new RoomSpray(5, 'R', "Zwarte spuitfles met gouden etiket", 48, 24.95, "Lavendel", "200mL");
    RoomSpray roomSpray2 = new RoomSpray(6, 'R', "Cement spuitfles met zwart etiket", 48, 24.95, "Oceaan", "120mL");

  this.productList.addAll(Arrays.asList(candle1, candle2, toteBag1, toteBag2, roomSpray1, roomSpray2));
  }

  // return all products
  public List<Product> GetAllProducts() {
    return this.productList;
  }

  // Retyrn single product
  public Optional<Product> GetProduct(Integer id) {
    Optional<Product> productOptional = Optional.empty();
    for (Product product : productList) {
      if (Objects.equals(id, product.getProductId())) {
        productOptional = Optional.of(product);
      }
    }

    return productOptional;
  }
}
