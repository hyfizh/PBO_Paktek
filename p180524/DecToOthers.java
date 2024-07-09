
package com.fatur.pbo2201082005.p180524;

public class DecToOthers {
    public static void main(String args[]){
        int num = 15;
        int base = 8;
        printBase(num, base);
    }
    static void printBase(int num, int base){
        int rem = 1;
        String digits = "0123456789abcdef";
        String result = "";
        //the iterative step
        while(num != 0){
            rem = num%base;
            num = num/base;
            result = result.concat(digits.charAt(rem)+"");
        }
        //printing the reserve of the result
        for(int i = result.length()-1; i >= 0; i--){
            System.out.print(result.charAt(i));
        }
    }
}
