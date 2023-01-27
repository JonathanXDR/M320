package com.tbz.project;

// Item interface
public interface Item {
    public String getName();
    public double getCost();
}

// Concrete classes implementing the Item interface
public class Döner implements Item {
    private String name;
    private double cost;
    public Döner(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
    public String getName() {
        return name;
    }
    public double getCost() {
        return cost;
    }
}

// Decorator classes
public abstract class ToppingDecorator implements Item {
    protected Item item;
    public ToppingDecorator(Item item) {
        this.item = item;
    }
    public abstract String getName();
    public abstract double getCost();
}

public class FillingDecorator extends ToppingDecorator {
    private String fillingType;
    private double cost;
    public FillingDecorator(Item item, String fillingType, double cost) {
        super(item);
        this.fillingType = fillingType;
        this.cost = cost;
    }
    public String getName() {
        return item.getName() + ", " + fillingType;
    }
    public double getCost() {
        return item.getCost() + cost;
    }
}

public class MeatDecorator extends ToppingDecorator {
    private String meatType;
    private double cost;
    public MeatDecorator(Item item, String meatType, double cost) {
        super(item);
        this.meatType = meatType;
        this.cost = cost;
    }
    public String getName() {
        return item.getName() + ", " + meatType;
    }
    public double getCost() {
        return item.getCost() + cost;
    }
}

public class BreadDecorator extends ToppingDecorator {
    private String breadType;
    private double cost;
    public BreadDecorator(Item item, String breadType, double cost) {
        super(item);
        this.breadType = breadType;
        this.cost = cost;
    }
    public String getName() {
        return item.getName() + ", " + breadType;
    }
    public double getCost() {
        return item.getCost() + cost;
    }
}
