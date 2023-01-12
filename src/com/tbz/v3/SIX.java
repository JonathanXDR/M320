package com.tbz.v3;

import java.util.HashMap;
import java.util.Map;

class SIX implements StockExchange {
    private Map<String, Double> prices;

    public SIX() {
        prices = new HashMap<>();
        prices.put("Microsoft", 120.0);
        prices.put("Google", 130.0);
    }

    @Override
    public double getPrice(String stock) {
        return prices.get(stock);
    }
}