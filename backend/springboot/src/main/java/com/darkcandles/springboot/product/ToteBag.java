package com.darkcandles.springboot.product;

public class ToteBag extends Product{
  public String Slogan;
  public String Material;

  public ToteBag(Integer productId, Character productType, String description, Integer stock, Double price, String slogan, String material) {
    super(productId, productType, description, stock, price);
    Slogan = slogan;
    Material = material;
  }

  public String getSlogan() {
    return Slogan;
  }

  public void setSlogan(String slogan) {
    Slogan = slogan;
  }

  public String getMaterial() {
    return Material;
  }

  public void setMaterial(String material) {
    Material = material;
  }
}
