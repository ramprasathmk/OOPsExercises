package com.oops_exercises.LambdaExpression.Main2;

public class Main2 {
    static void main() {
        Shikar ref1=(x) -> {
            System.out.println(x);
            return 1.5;
        };
        double res=ref1.sendMsg("Hi Iam Shikar");
        System.out.println("It cost "+res+" rupees to Send Message.");
    }
}
