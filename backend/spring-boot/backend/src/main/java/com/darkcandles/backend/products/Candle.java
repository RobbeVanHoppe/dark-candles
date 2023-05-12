package com.darkcandles.backend.products;

import java.time.LocalDateTime;

public final class Candle extends Product{
  private String color;
  private String scent;
  private String shape;

  public Candle(Character productType, String description, Integer stock, Double price, LocalDateTime created) {
    super(productType, description, stock, price, created);
  }
}
