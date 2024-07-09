
package com.fatur.pbo2201082005.p140524;

public class DivByZero {

    public static void main(String args[]) {
        try {
            int angka = Integer.parseInt(args[0]);
            System.out.println(angka / 0);
            System.out.println("Cetak.");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Argument tidak ada   :" + ex.getMessage());
        } catch (ArithmeticException ex) {
            System.out.println("Bagi dengan 0   :" + ex.getMessage());
        } finally {
            System.out.println("Block Finally Setelah Exception");
        }
    }
}
