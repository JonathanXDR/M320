package com.tbz.v3;

import java.util.ArrayList;
import java.util.List;

class Portfolio {
    private List<String> stocks;
    private StockExchange stockExchange;

    public Portfolio(StockExchange stockExchange) {
        this.stocks = new ArrayList<>();
        this.stockExchange = stockExchange;
    }

    public void addStock(String stock) {
        stocks.add(stock);
    }

    public double getTotalValue() {
        double total = 0;
        for (String stock : stocks) {
            total += stockExchange.getPrice(stock);
        }
        return total;
    }
}
