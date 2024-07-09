/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatur.pbo2201082005.p020424;

/**
 *
 * @author Fatur
 */
public class Karyawan {
    private String nama;
    private String nip;
    private int masaKerja;
    private double gaji = 2000000; //gaji pokok 2 juta
    
    public Karyawan() {
       
    }
    
    public Karyawan(String nama, String nip){
        this.nama = nama;
        this.nip = nip;
    }
    
    public Karyawan(int masaKerja){
        this.masaKerja = masaKerja;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNip(){
        return nip;
    }
    
    public int getmasaKerja(){
        return masaKerja;
    }
    
    public double getGaji(){
        return gaji;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setNip(String nip){
        this.nip = nip;
    }
    
    public void setmasaKerja(int masaKerja){
        this.masaKerja = masaKerja;
    }
    
    public void setGaji(double gaji){
        this.gaji = gaji;
    }
    
    public double hitungTunjangan(){
        double tj;
        if(masaKerja <= 5) {
            tj = masaKerja * 300000;
            return tj;
        } else {
            tj = masaKerja * 500000;
            return tj;
        }
        
    }
    
    public double hitungGajiTotal(){
        double gt;
        gt = gaji + hitungTunjangan();
        return gt;
    }
    
    public void printKaryawan(){    
        System.out.println("Nama = " + nama);
        System.out.println("NIP = " + nip);
        System.out.println("Masa Kerja = " + masaKerja);
    }
    
    public void printKaryawan(double gaji, double tj, double gt){
        System.out.println("Gaji = " + gaji);
        System.out.println("Tunjangan = " + tj);
        System.out.println("Gaji Total = " + gt);
    }
}
