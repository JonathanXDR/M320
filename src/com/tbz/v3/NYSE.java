package com.tbz.v3;

import java.util.HashMap;
import java.util.Map;

class NYSE implements StockExchange {
    private Map<String, Double> prices;

    public NYSE() {
        prices = new HashMap<>();
        prices.put("Microsoft", 100.0);
        prices.put("Google", 150.0);
    }

    @Override
    public double getPrice(String stock) {
        return prices.get(stock);
    }
}