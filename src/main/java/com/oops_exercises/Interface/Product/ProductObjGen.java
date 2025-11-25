package com.oops_exercises.Interface.Product;

public class ProductObjGen {
    static void main() {
        Product ref1=new Mobile(12);
        Product ref2=new Laptop("Intel");
        ref1.details();
        ref2.details();
    }
}
