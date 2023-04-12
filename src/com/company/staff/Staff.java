package com.company.staff;

public abstract class Staff {
    private String brand;
    private String price;

    public Staff(String brand, String price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "brand = " + brand + ", price = " + price;
    }
}
