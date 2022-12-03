package com.iskhak.behavioral.bridge;

public class StockExchanges extends Program{
    protected StockExchanges(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange development in progress...");
        developer.writeCode();
    }
}
