package com.darkcandles.springboot.product;

public class RoomSpray extends Product{
  public String Scent;
  public String Volume;

  public RoomSpray(Integer productId, String description, Integer stock, Double price, String scent, String volume) {
    super(productId, description, stock, price);
    Scent = scent;
    Volume = volume;
  }

  public String getScent() {
    return Scent;
  }

  public void setScent(String scent) {
    Scent = scent;
  }

  public String getVolume() {
    return Volume;
  }

  public void setVolume(String volume) {
    Volume = volume;
  }
}
