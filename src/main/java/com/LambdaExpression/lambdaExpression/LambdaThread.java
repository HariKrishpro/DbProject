package com.LambdaExpression.lambdaExpression;

public class LambdaThread {
    public static void main(String[] args) {
        Thread thread = new Thread(()-> {
                int i=5;
                while(i-->0){
                    System.out.println(i);
                }
            }
          );
        thread.start();
    }
}
