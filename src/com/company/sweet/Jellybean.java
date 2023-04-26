package com.company.sweet;

public class Jellybean extends Podarok {
    private String idJellybean;

    public Jellybean(String name, Double weight, Double price, String idJellybean) {
        super(name, weight, price);
        this.idJellybean = idJellybean;
    }

    public String getIdJellybean() {
        return idJellybean;
    }

    public void setIdJellybean(String idJellybean) {
        this.idJellybean = idJellybean;
    }

    @Override
    public String toString() {
        return "Jellybean + [" + super.toString() + ", idJellybean = " + idJellybean + "]";
    }
}
