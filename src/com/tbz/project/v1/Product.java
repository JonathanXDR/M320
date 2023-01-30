package com.tbz.project.v1;

public class Product extends Item {
    private String bread;
    private String filling;
    private String sauce;

    public Product(String name, double price, String bread, String filling, String sauce) {
        super(name, price);
        this.bread = bread;
        this.filling = filling;
        this.sauce = sauce;
    }

    public String getBread() {
        return bread;
    }

    public String getFilling() {
        return filling;
    }

    public String getSauce() {
        return sauce;
    }
}

