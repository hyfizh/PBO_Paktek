 
package com.fatur.pbo2201082005.p230424;

public class StudentExample {
    public static void main(String[] args) {
        Person ref;
        Student akbar = new Student();
        akbar.setName("akbar");
        akbar.setAddress("Bukittinggi");
        Employee tono = new Employee();
        tono.setName("tono");
        tono.setAddress("Bukittinggi");
        
//        ref = akbar;
//        System.out.println("Nama Mahasiswa :"+ref.getName());
//        System.out.println("Alamat         :"+ref.getAddress());
//        
//        ref = tono;
//        System.out.println("Nama Karyawan :"+ref.getName());
//        System.out.println("Alamat        :"+ref.getAddress());
        
        printInformation(akbar);
        printInformation(tono);
//    Student zan = new Student();
//    System.out.println("Nama    = "+zan.getName());
//    System.out.println("Address = "+zan.getAddress());
    }
    
    public static void printInformation(Person p){
        if(p instanceof Student){
            System.out.println("Nama Mahasiswa :"+p.getName());
            System.out.println("Alamat         :"+p.getAddress());
        }
        if(p instanceof Employee){
            System.out.println("Nama Karyawan  :"+p.getName());
            System.out.println("Alamat         :"+p.getAddress());
        }
    }
}