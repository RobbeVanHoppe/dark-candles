package com.darkcandles.backend.products;

import java.time.LocalDateTime;

public final class Candle extends Product{
  private String color;
  private String scent;
  private String shape;

  public Candle(ProductType productType, String description, Integer stock, Double price, LocalDateTime created, String color, String scent, String shape) {
    super(productType, description, stock, price, created);
    this.color = color;
    this.scent = scent;
    this.shape = shape;
  }
}
