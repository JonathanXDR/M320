package com.tbz.v3;

public class V3 {
    public void Start() {
            Portfolio portfolio = new Portfolio(new NYSE());
            portfolio.addStock("Microsoft");
            portfolio.addStock("Google");
            System.out.println("Total value (NYSE): " + portfolio.getTotalValue());

            portfolio = new Portfolio(new SIX());
            portfolio.addStock("Microsoft");
            portfolio.addStock("Google");
            System.out.println("Total value (SIX): " + portfolio.getTotalValue());
    }
}