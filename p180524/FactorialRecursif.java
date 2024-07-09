package com.fatur.pbo2201082005.p180524;


public class FactorialRecursif {
    static int factorial(int n){
        if (n == 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }
    
    public static void main(String[] args){
        int n = 10;
        System.out.println(factorial(n));
    }
}
