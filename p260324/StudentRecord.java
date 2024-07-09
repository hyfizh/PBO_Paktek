/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatur.pbo2201082005.p260324;

/**
 *
 * @author Fatur
 */
public class StudentRecord {
    protected String name;
    protected String address;
    protected int age;
    protected double mathGrade;
    protected double englishGrade;
    protected double scienceGrade;
    protected double average;
    
    private static int studentCount;
    public StudentRecord(){
        System.out.println("Inside Person Constructor");
        name = "";
        address = "";
    }
    
    public StudentRecord(String temp){
        studentCount++;
        this.name = temp;
    }
    
    public StudentRecord(String name, String address){
        studentCount++;
        this.name = name;
        this.address = address;
    }

    StudentRecord(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getName(){
        System.out.println("Person: getName");
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddres(String address){
        this.address = address;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public double getMathGrade(){
        return mathGrade;
    }
    
    public void setMathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }
    
    public double getEnglishGrade(){
        return englishGrade;
    }
    
    public void setEnglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }
    
    public double getScienceGrade(){
        return scienceGrade;
    }
    
    public void setScienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    
    public double getAverage(){
        average = (mathGrade + englishGrade + scienceGrade) / 3;
        return average;
    }
    
    public static int getStudentCount(){
        return studentCount;
    }
    
    public void print(String temp) {
        System.out.println("Name    :" + name);
        System.out.println("Address :" + address);
        System.out.println("Umur    :" + age);
    }
    public void print(double eGrade, double mGrade, double sGrade){
        System.out.println("Name          :" + name);
        System.out.println("Math Grade    :" + mGrade);
        System.out.println("English Grade :" + eGrade);
        System.out.println("Science Grade :" + sGrade);
    }
}
