package com.bl;

public class StockMain {

    public static void main(String[] args) {

        Stock obj = new Stock();
        obj.setStockName("parle");
        System.out.println(obj.getStockName());

        obj.setStockPrice(200);
        System.out.println(obj.getStockPrice());

        obj.setStockNumber(49);
        System.out.println(obj.getStockNumber());

        System.out.println("total value of stock :" +obj.toString());


    }
}
