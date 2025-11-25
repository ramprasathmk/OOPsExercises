package com.oops_exercises.LambdaExpression.Main3;

public class Main3 {
    static void main() {
        Rajesh ref1=(x, y) -> {
            System.out.println("Hi this is: "+y);
            System.out.println("My age is: "+x);
            return "I am good in HIP-HOP";
        };
        String res=ref1.dance(23, "Rajesh");
        System.out.println(res);
        Rajesh.swim();
    }
}
