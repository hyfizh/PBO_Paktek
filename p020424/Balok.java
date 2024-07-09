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
public class Balok {
    private int panjang, lebar, tinggi, la, lp, volume;
    
    public Balok(){
        
    }
    public Balok(int panjang){
        this.panjang = panjang;
    }
    
    public Balok(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public int getPanjang(){
        return panjang;
    }
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    
    public int getLebar(){
        return lebar;
    }
    public void setLebar(int lebar){
        this.lebar = lebar;
    }
 
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    public int getTinggi(){
        return tinggi;
    }
    public int hitungLA(){
        return panjang * lebar;
    }
    public int hitungLP(){
        int lp;
        lp = 2 * ((panjang*lebar)+(lebar*tinggi)+(panjang*tinggi));
        return lp;
    }
    public int hitungVolume(){
        return panjang * lebar * tinggi;
    }
    public int hitungVolume(int la){
        return la * tinggi;
    }
    
    public void printBalok(){
        System.out.println("Panjang = " + panjang);
        System.out.println("Lebar   = " + lebar);
        System.out.println("Tinggi  = " + tinggi);
    }
    
    public void printBalok(int la, int lp, int volume){
        System.out.println("Luas alas = " + la);
        System.out.println("Luas Permukaan = " + lp);
        System.out.println("Volume    = " + volume);
    }
}
