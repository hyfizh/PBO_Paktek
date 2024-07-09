package com.fatur.pbo2201082005.p260324;

public class studentRecordExample {
    public static void main(String[] args){
        StudentRecord ref;
        Student zann = new Student();
        zann.setName("Zann");
//        zann.setAge(20);
        zann.setAddres("Padang");
//        zann.setMathGrade(90);
//        zann.setEnglishGrade(80);
//        zann.setScienceGrade(85);
        
        Employee fizh = new Employee();
        fizh.setName("akbar");
//       zann.setAge(19);
        fizh.setAddres("batusangkar");
//        zann.setMathGrade(90);
//        zann.setEnglishGrade(80);
//        zann.setScienceGrade(85);
        
        printInformation(zann);
        printInformation(fizh);
//        System.out.println("Nama             :"+zann.getName());
//        System.out.println("Umur             :"+zann.getAge());
//        System.out.println("Alamat           :"+zann.getAddress());
//        System.out.println("Nilai Mtk        :"+zann.getMathGrade());
//        System.out.println("Nilai B.inggris  :"+zann.getEnglishGrade());
//        System.out.println("Nilai Ipa        :"+zann.getScienceGrade());
//        System.out.println("Rata-rata        :"+zann.getAverage());
        //menampilkan jumlah siswa
//        System.out.println("Banyak siswa     :"+StudentRecord.getStudentCount());
//        //contoh pemanggilan methos overload
//        System.out.println("==================");
//        student1.print(student1.getName());
//        System.out.println("==================");
//        student1.print(student1.getEnglishGrade(), student1.getMathGrade(), student1.getScienceGrade());
//        
//        StudentRecord annaRecord = new StudentRecord("anna");
//        StudentRecord aliRecord = new StudentRecord("ali","Padang");
//        StudentRecord akbarRecord = new StudentRecord(90,80,70);
//        
//        System.out.println("==================");
//        annaRecord.print(annaRecord.getName());
//        System.out.println("==================");
//        aliRecord.print(aliRecord.getName());
//        System.out.println("==================");
//        akbarRecord.print(akbarRecord.getEnglishGrade(), akbarRecord.getMathGrade(), akbarRecord.getScienceGrade());
//        
//        System.out.println("Banyak Siswa    :"+StudentRecord.getStudentCount());
    }
    
    public static void printInformation(StudentRecord p){
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
