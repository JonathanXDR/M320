package com.tbz.project.v1;

public class Customization {
    private String bread;
    private String filling;
    private String sauce;

    public Customization(String bread, String filling, String sauce) {
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
