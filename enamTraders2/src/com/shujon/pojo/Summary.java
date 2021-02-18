package com.shujon.pojo;

import java.time.LocalDateTime;

public class Summary {

    private int id;
    private Product product;// unique
    private int totalPurchaseQty;
    private int totalSalesQty;
    private int availableQty;
    private LocalDateTime lastUpdate;

    public Summary() {
    }

    public Summary(Product product, int totalPurchaseQty, int totalSalesQty, int availableQty, LocalDateTime lastUpdate) {
        this.product = product;
        this.totalPurchaseQty = totalPurchaseQty;
        this.totalSalesQty = totalSalesQty;
        this.availableQty = availableQty;
        this.lastUpdate = lastUpdate;
    }

    public Summary(int id, Product product, int totalPurchaseQty, int totalSalesQty, int availableQty, LocalDateTime lastUpdate) {
        this.id = id;
        this.product = product;
        this.totalPurchaseQty = totalPurchaseQty;
        this.totalSalesQty = totalSalesQty;
        this.availableQty = availableQty;
        this.lastUpdate = lastUpdate;
    }

    public int getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public int getTotalPurchaseQty() {
        return totalPurchaseQty;
    }

    public int getTotalSalesQty() {
        return totalSalesQty;
    }

    public int getAvailableQty() {
        return availableQty;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

}
