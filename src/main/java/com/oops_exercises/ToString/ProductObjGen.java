package com.oops_exercises.ToString;

import java.util.Arrays;

class Product {
    int id;
    String name;

    Product() {}

    Product(int id, String name) {
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return id+":"+name;
    }
}


public class ProductObjGen {
    public static void main(String[] args) {
        Product bag=new Product(111, "Bag");
        Product ball=new Product(112, "Ball");
        Product pencil=new Product(113, "Pencil");
        Product[] products={bag, ball, pencil};
        System.out.println(Arrays.toString(products));
    }
}
