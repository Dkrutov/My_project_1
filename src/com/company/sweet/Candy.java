package com.company.sweet;
/*
*Формируется сладкий подарок.
- Он может включать в себя разные сладости (Candy, Jellybean, etc.)
- У каждой сладости есть название, вес, цена и свой уникальный параметр
- Необходимо собрать подарок из сладостей
- Найти общий вес подарка, общую стоимость подарка
- Вывести на консоль информацию о всех сладостях в подарке
*/
public class Candy extends Podarok {
    private String idCandy;

    public Candy(String name, Double weight, Double price, String idCandy) {
        super(name, weight, price);
        this.idCandy = idCandy;
    }

    public String getIdCandy() {
        return idCandy;
    }

    public void setIdCandy(String idCandy) {
        this.idCandy = idCandy;
    }

    @Override
    public String toString() {
        return "Candy + [" + super.toString() + ", idCandy = " + idCandy + "]";
    }
}
