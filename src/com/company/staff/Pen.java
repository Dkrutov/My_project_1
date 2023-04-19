package com.company.staff;

public class Pen extends Staff {
    private String type;

    public Pen(String brand, Double price, String type) {
        super(brand, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pen [" + super.toString() + ", type = " + type + "]";
    }
}
