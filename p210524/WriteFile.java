
package com.fatur.pbo2201082005.p210524;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class WriteFile {
    public static void main(String[] args) throws IOException {
        System.out.println("Nama File ?");
        String filename;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        filename = br.readLine();
        System.out.println("Tulis File " + filename + "...");
        System.out.println("Type q$ untuk berhenti");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(filename);
        } catch (FileNotFoundException ex) {
            
        }
        try {
            boolean done = false;
            int data;
            do {
                data = br.read();
                if ((char) data == 'q') {
                    data = br.read();
                    if ((char) data == '$') {
                        done = true;
                    } else {
                        fos.write('q');
                        fos.write(data);
                    }
                } else {
                    fos.write(data);
                } 
            } while (!done);
        }catch (IOException ex) {
                    System.out.println("Problem in reading from the file");
                    }
    }
}
