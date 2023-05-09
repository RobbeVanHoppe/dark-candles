package com.darkcandles.springboot.product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
  private List<Product> productList;

  public ProductService(List<Product> productList) {
    this.productList = new ArrayList<>();

    Candle candle1 = new Candle(1, 'C', "Kaars met bolletjes", 30, 25.95, "Zwart", "Kubus");
    Candle candle2 = new Candle(2, 'C', "Kaars met hartjes", 25, 19.95, "Rood", "Tetraëder");
    ToteBag toteBag1 = new ToteBag(3, 'T', "Linnen totebag met tekening", 50, 12.95, "Het leven is geen ponykamp", "Linnen");
    ToteBag toteBag2 = new ToteBag(3, 'T', "Linnen totebag met tekening", 50, 12.95, "Het leven is geen ponykamp", "Linnen");
    ;
  }
}
