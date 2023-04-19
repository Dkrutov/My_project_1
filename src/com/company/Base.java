package com.company;

import com.company.staff.Pen;
import com.company.staff.Pencil;
import com.company.staff.Staff;


public class Base {
    public static void main(String[] args) {
        Pen pen1 = new Pen("brand1", 19.9, "some pen");
        Pencil pencil = new Pencil("brand1",10.99,"10l");
        Pencil pencil2 = new Pencil();
        pencil2.setSize("10k");
        pencil2.setBrand("brand2");
        pencil2.setPrice(10.10);
        Staff [] box = {pen1,pencil,pencil2};
        for (Staff someStaff: box) {
            System.out.println(someStaff.toString());
        }
    }
}
