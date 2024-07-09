
package com.fatur.pbo2201082005.p180524;

public class DecToOthersRecur {
    static void printBase(int num, int base){
        String digits = "0123456789abcdef";
        //recursif step
        if (num >= base) {
            printBase(num/base, base);
        }
        //Base case: num < base
        System.out.print(digits.charAt(num%base));
    }
    public static void main(String args[]){
        int num = 8;
        int base = 15;
        printBase(num, base);
    }
}
