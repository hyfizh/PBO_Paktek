
package com.fatur.pbo2201082005.p210524;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReadFile {
       public static void main(String args[]) throws IOException {
        System.out.println("What is the name of the file to read form?");
        String filename;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        filename = br.readLine();
        System.out.println("Now reading from " + filename + "...");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filename);
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found.");
        } 
        try {
            int data;
            int temp = 20;
            do {
                temp = fis.read();
                data = (char) temp;
               
            if (temp != -1) {
                System.out.print(data);                
            }         
           } while (temp != -1);
            data ^= temp;
        }catch (IOException ex){
            System.out.println("Problem in reading from the file.");
        }
    }
}

