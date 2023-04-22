package com.darkcandles.springboot.order;

import java.time.LocalDate;

public class Order {

    private Integer OrderID;
    private Integer CustomerID;
    private Integer ArticleID;
    private LocalDate OrderDate;
    
    public Order(Integer orderID, Integer customerID, Integer articleID) {
        OrderID = orderID;
        CustomerID = customerID;
        ArticleID = articleID;
        OrderDate = LocalDate.now();
    }

    public Integer getOrderID() {
        return OrderID;
    }

    public void setOrderID(Integer orderID) {
        OrderID = orderID;
    }

    public Integer getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(Integer customerID) {
        CustomerID = customerID;
    }

    public Integer getArticleID() {
        return ArticleID;
    }

    public void setArticleID(Integer articleID) {
        ArticleID = articleID;
    }

    public LocalDate getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        OrderDate = orderDate;
    }    
}