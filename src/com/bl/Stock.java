package com.bl;

public class Stock {
    private String stockName;
    private int stockPrice;
    private int stockNumber;

    public Stock(String stockName, int stockPrice, int stockNumber) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.stockNumber = stockNumber;
    }

    public Stock() {

    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(int stockPrice) {
        this.stockPrice = stockPrice;
    }

    public int getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(int stockNumber) {
        this.stockNumber = stockNumber;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockName='" + stockName + '\'' +
                ", stockPrice=" + stockPrice +
                ", stockNumber=" + stockNumber +
                '}';
    }
}
