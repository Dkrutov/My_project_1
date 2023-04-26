package com.company.sweet;

public class Chocolate extends Podarok {
    private String idChocolate;

    public Chocolate(String name, Double weight, Double price, String idChocolate) {
        super(name, weight, price);
        this.idChocolate = idChocolate;
    }

    public String getIdChocolate() {
        return idChocolate;
    }

    public void setIdChocolate(String idChocolate) {
        this.idChocolate = idChocolate;
    }

    @Override
    public String toString() {
        return "Chocolate + [" + super.toString() + ", idChocolate = " + idChocolate + "]";
    }
}
