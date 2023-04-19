package com.company.staff;

public class Pencil extends Staff {
    private String size;

    public Pencil() {}

    public Pencil(String brand, Double price, String size) {
        super(brand, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pencil + [" + super.toString() + ", size = " + size + "]";
    }
}
