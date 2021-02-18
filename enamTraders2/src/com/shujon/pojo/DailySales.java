
package com.shujon.pojo;

import java.time.LocalDateTime;



public class DailySales {
    private int id;
    private LocalDateTime showDate;
    private double lastSales;
    private double todaysSales;
    private double totalSales;

    public DailySales(int id, LocalDateTime showDate, double lastSales, double todaysSales, double totalSales) {
        this.id = id;
        this.showDate = showDate;
        this.lastSales = lastSales;
        this.todaysSales = todaysSales;
        this.totalSales = totalSales;
    }

    public DailySales(LocalDateTime showDate, double lastSales, double todaysSales, double totalSales) {
        this.showDate = showDate;
        this.lastSales = lastSales;
        this.todaysSales = todaysSales;
        this.totalSales = totalSales;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getShowDate() {
        return showDate;
    }

    public double getLastSales() {
        return lastSales;
    }

    public double getTodaysSales() {
        return todaysSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    
}
