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
public class KaryawanExample {
    public static void main(String[] args) {
        String nama;
        String nip;
        int masaKerja;
        
        Scanner input = new Scanner(System.in);
        
        //karyawan 1
        System.out.println("Karyawan 1");
        Karyawan k1 = new Karyawan();
        System.out.print("Nama = "); nama = input.nextLine();
        k1.setNama(nama);
        System.out.print("NIP = "); nip = input.nextLine();
        k1.setNip(nip);
        System.out.print("Masa Kerja = "); masaKerja = input.nextInt();
        k1.setmasaKerja(masaKerja);
        k1.printKaryawan(k1.getGaji(), k1.hitungTunjangan(), k1.hitungGajiTotal());
        
        //karyawan 2
        System.out.println("Karyawan 2");
        Karyawan k2 = new Karyawan("Zann", "090504");
        k2.setmasaKerja(6);
        k2.printKaryawan();
        k2.printKaryawan(k2.getGaji(), k2.hitungTunjangan(), k2.hitungGajiTotal());
        
        //Karyawan 3
        System.out.println("Karyawan 3");
        System.out.print("Nama = "); nama = input.nextLine();
        System.out.print("NIP  = "); nip = input.nextLine();
        System.out.print("Masa Kerja = "); masaKerja = input.nextInt();
        Karyawan k3 = new Karyawan();
        k3.printKaryawan(k3.getGaji(), k3.hitungTunjangan(), k3.hitungGajiTotal());
    }
}
