package com.darkcandles.backend.products;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public final class Candle extends Product{
  @JsonProperty("color")
  private final String color;
  @JsonProperty("scent")
  private final String scent;
  @JsonProperty("shape")
  private final String shape;

  public Candle(ProductType productType, String description, Integer stock, Double price, LocalDateTime created, String color, String scent, String shape) {
    super(productType, description, stock, price, created);
    this.color = color;
    this.scent = scent;
    this.shape = shape;
  }
}
