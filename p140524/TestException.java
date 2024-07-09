/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatur.pbo2201082005.p140524;

/**
 *
 * @author Fatur
 */
public class TestException {
    public static void main(String[] args){
        try {
        for(int i = 0; true; i++) {
            System.out.println("args[" + i + "]=" + args[i]);
        }
        }catch(Exception ex){
            System.out.println("Error   :" + ex.getMessage());
        }
    }
}
