package com.company.sweet;

import javax.naming.Name;

/**
 * Created by Dmitriy on 21.02.23
 * Этот класс базовый для калькулятора
 * @author Dmitry Krutov
 * @see #
 */
/*
*Формируется сладкий подарок.
- Он может включать в себя разные сладости (Candy, Jellybean, etc.)
- У каждой сладости есть название, вес, цена и свой уникальный параметр
- Необходимо собрать подарок из сладостей
- Найти общий вес подарка, общую стоимость подарка
- Вывести на консоль информацию о всех сладостях в подарке
*/
public abstract class Podarok {
    public String name;
    public Double weight;
    public Double price;

    public Podarok(String name, Double weight, Double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name = " + name + ", Price = " + price + ", Weight = " + weight;
    }
}
