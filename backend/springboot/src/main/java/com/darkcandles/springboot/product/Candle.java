package com.darkcandles.springboot.product;

public class Candle extends Product {
  public String Colour;
  public String Shape;

  public Candle(Integer productId, Character productType, String description, Integer stock, Double price, String colour, String shape) {
    super(productId, productType, description, stock, price);
    Colour = colour;
    Shape = shape;
  }
}
