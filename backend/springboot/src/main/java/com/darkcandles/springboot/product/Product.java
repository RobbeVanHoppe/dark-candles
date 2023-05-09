package com.darkcandles.springboot.product;

public abstract class Product {
  public Integer ProductId;
  public Character ProductType;
  public String Description;
  public Integer Stock;
  public Double Price;

  public Product(Integer productId, Character productType, String description, Integer stock, Double price) {
    ProductId = productId;
    ProductType = productType;
    Description = description;
    Stock = stock;
    Price = price;
  }

  public Integer getProductId() {
    return ProductId;
  }

  public void setProductId(Integer productId) {
    ProductId = productId;
  }

  public Character getProductType() {
    return ProductType;
  }

  public void setProductType(Character productType) {
    ProductType = productType;
  }

  public String getDescription() {
    return Description;
  }

  public void setDescription(String description) {
    Description = description;
  }

  public Integer getStock() {
    return Stock;
  }

  public void setStock(Integer stock) {
    Stock = stock;
  }

  public Double getPrice() {
    return Price;
  }

  public void setPrice(Double price) {
    Price = price;
  }
}
