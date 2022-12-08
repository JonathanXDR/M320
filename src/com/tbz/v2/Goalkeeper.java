package com.tbz.v2;

public class Goalkeeper extends Player{
    private double size;

    public Goalkeeper(String name){
this.setName(name);
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
