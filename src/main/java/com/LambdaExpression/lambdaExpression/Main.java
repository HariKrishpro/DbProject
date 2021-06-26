package com.LambdaExpression.lambdaExpression;

public class Main {
    public static void main(String[] args) {
        ImpPerform(s->s.length());

    }
    public static void ImpPerform(Hello hello) {
        System.out.println(hello.perform("HELLO"));

    }
}
