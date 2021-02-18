
package com.shujon.pojo;

import java.time.LocalDateTime;


public class Purchase {
   private int id;
    private Product product;
    private int qty;
    private double unitPrice;
    private double totalPrice;
    private LocalDateTime purchaseDateTime;

    public Purchase() {
    }

    public Purchase(Product product, int qty, double unitPrice, double totalPrice, LocalDateTime purchaseDateTime) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.purchaseDateTime = purchaseDateTime;
    }

    public Purchase(int id, Product product, int qty, double unitPrice, double totalPrice, LocalDateTime purchaseDateTime) {
        this.id = id;
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.purchaseDateTime = purchaseDateTime;
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

    public LocalDateTime getPurchaseDateTime() {
        return purchaseDateTime;
    }

}
