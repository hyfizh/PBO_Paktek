/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatur.pbo2201082005.p020424;

import java.util.Scanner;

/**
 *
 * @author Fatur
 */
public class BalokExample {
    public static void main(String[] args){
        int p, l, t, la;
        Scanner in = new Scanner(System.in);
        //buat balok b1
        System.out.println("Program Balok 1");
        Balok b1 = new Balok();
        System.out.println("Panjang = "); p = in.nextInt();
        b1.setPanjang(p);
        System.out.println("Lebar = "); l = in.nextInt();
        b1.setLebar(l);
        System.out.println("Tinggi = "); t = in.nextInt();
        b1.setTinggi(t);
        la = b1.hitungLA();
        b1.printBalok(la, b1.hitungLP(), b1.hitungVolume());
        
        //buat balok b2
        System.out.println("Program Balok 2");
        Balok b2 = new Balok(10);
        b2.setLebar(4);
        b2.setTinggi(5);
        b2.printBalok();
        b2.printBalok(b2.hitungLA(), b2.hitungLP(), b2.hitungVolume(b2.hitungLA()));
        
        //buat balok b3
        System.out.println("Program Balok 3");
        System.out.print("Panjang = "); p = in.nextInt();
        System.out.print("Lebar = "); l = in.nextInt();
        System.out.print("Tinggi = "); t = in.nextInt();
        Balok b3 = new Balok(p,l,t);
        la = b3.hitungLA();
        b3.printBalok(la, b3.hitungLP(), b3.hitungVolume(la));
    }
}
