package com.shujon.pojo;

import java.time.LocalDateTime;

public class Sales {

    private int id;
    private Product product;
    private int qty;
    private double unitPrice;
    private double totalPrice;
    private LocalDateTime salesDateTime;

    public Sales() {
    }

    public Sales(int id, Product product, int qty, double unitPrice, double totalPrice, LocalDateTime salesDateTime) {
        this.id = id;
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.salesDateTime = salesDateTime;
    }

    public Sales(Product product, int qty, double unitPrice, double totalPrice, LocalDateTime salesDateTime) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.salesDateTime = salesDateTime;
    }

    public int getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public LocalDateTime getSalesDateTime() {
        return salesDateTime;
    }

}
