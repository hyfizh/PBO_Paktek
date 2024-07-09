/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatur.pbo2201082005.p270224;

/**
 *
 * @author Fatur
 */
public class RelasiDemo {
    public static void main(String[] args) {
    //a few numbers
        int i = 37;
        int j = 42;
        int k = 42;
        System.out.println("Variable values...");
        System.out.println(" i = " + i);
        System.out.println(" j = " + j);
        System.out.println(" k = " + k);
        
    //lebih besar dari
        System.out.println("Greater than...");
        System.out.println(" i > j = " + (i > j)); //false
        System.out.println(" j > i = " + (j > i)); //true
        System.out.println(" k > j = " + (k > j)); //false
        
    //lebih besar atau sama dengan
        System.out.println("Greater than or equal to...");
        System.out.println(" i >= j = " + (i >= j)); //false
        System.out.println(" j >= i = " + (j >= i)); //true
        System.out.println(" k >= j = " + (k >= j)); //true
        
    //lebih kecil
        System.out.println("Less than...");
        System.out.println(" i < j = " + (i < j)); //true
        System.out.println(" j < i = " + (j < i)); //false
        System.out.println(" k < j = " + (k < j)); //false
    
    //lebih kecil atau sama dengan
        System.out.println("Less than or equal to...");
        System.out.println(" i <= j = " + (i <= j)); //true
        System.out.println(" j <= i = " + (j <= i)); //false
        System.out.println(" k <= j = " + (k <= j)); //true
        
    //sama dengan
        System.out.println("Equal to...");
        System.out.println(" i == j = " + (i  == j )); //false
        System.out.println(" k == j = " + (k  == j )); //true
        
    //tidak sama dengan
        System.out.println("Not equal to...");
        System.out.println(" i != j = " + (i !=j)); //true
        System.out.println(" k != j = " + (k !=j)); //false
    }
}
