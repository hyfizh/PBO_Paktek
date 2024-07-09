/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatur.pbo2201082005.p210524;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Fatur
 */
public class DataNumerik {
    public static void main(String[] args) throws IOException {
        System.out.println("What is the name of the file to read from?");
        String filename;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        filename = br.readLine();
        System.out.println("Now reading from " + filename + "...");

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filename);
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found.");
            return;
        }

        try {
            int data;
            int key = 42; // Kunci untuk operasi XOR

            while ((data = fis.read()) != -1) {
                // Melakukan operasi XOR pada data dengan kunci
                data ^= key;

                // Menampilkan karakter setelah operasi XOR
                System.out.print((char) data);
            }
        } catch (IOException ex) {
            System.out.println("Problem in reading from the file.");
        }
    }
}

