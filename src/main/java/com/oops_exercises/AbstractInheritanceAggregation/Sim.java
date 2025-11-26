package com.oops_exercises.AbstractInheritanceAggregation;

public class Sim {
    private String operatorName;
    private int bandWidth;
    private double price;

    private Sim() {}

    private Sim(String operatorName, int bandWidth, double price) {
        this.operatorName=operatorName;
        this.bandWidth=bandWidth;
        this.price=price;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName=operatorName; }

    public int getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(int bandWidth) {
        this.bandWidth=bandWidth;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price=price;
    }

    public static Sim getSimObj(String operatorName, int bandWidth, double price) {
        return new Sim(operatorName, bandWidth, price);
    }

    public void detailsOfSim() {
        System.out.println("***********************Sim Details***********************");
        System.out.println("Operator Name: "+operatorName);
        System.out.println("Band Width: "+bandWidth);
        System.out.println("Price: "+price);
    }
}
