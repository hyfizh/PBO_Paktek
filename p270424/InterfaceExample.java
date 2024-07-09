
package com.fatur.pbo2201082005.p270424;

public class InterfaceExample {
    public static void main(String[] args){
        Relation myInteger = new MyInteger();
        System.out.println(myInteger.isLess(5, 4));
        Relation myDouble = new MyDouble();
        System.out.println(myDouble.isLess(10.5, 5.3));
        
        Line line1 = new Line(1, 5, 2, 4);
        Line line2 = new Line(2, 4, 1, 3);
        
        Relation line = new Line();
        System.out.println(line.isGreater(line1, line2));
        System.out.println("Line 1 "+line1.getLength());
        System.out.println("Line 2 "+line2.getLength());
        
        Persegi persegi1 = new Persegi(4);
        Persegi persegi2 = new Persegi(5);
        
        Relation persegi = new Persegi();
        System.out.println(persegi.isGreater(persegi1, persegi2));
        System.out.println("Luas Persegi 1 "+persegi1.getLuas());
        System.out.println("Luas Persegi 2 "+persegi2.getLuas());
        
        PersegiPanjang p1 = new PersegiPanjang(5, 10);
        PersegiPanjang p2 = new PersegiPanjang(10, 20);
        
        Relation persegipanjang = new PersegiPanjang();
        System.out.println(persegipanjang.isGreater(p1, p2));
        System.out.println("Luas Persegi Panjang 1 "+p1.getLuas());
        System.out.println("Luas Persegi Panjang 2 "+p2.getLuas());
    }
}
