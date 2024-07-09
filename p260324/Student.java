
package com.fatur.pbo2201082005.p260324;


public class Student extends StudentRecord{
    public Student(){
        super();
        super.name = "Akbar";
        super.address = "Padang";
//        super.age = "20";
//        super.mathGrade = "70";
//        super.englishGrade = "80";
//        super.scienceGrade = "90";
//        super.average = "80";
        System.out.println("Student Constructor");
    }
    
    @Override
    public String getName(){
        System.out.println("Student: getName");
        return name;
    }
}
