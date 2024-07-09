/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatur.pbo2201082005.p080624;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fatur
 */
public class PinjamBukuDao {
    private List<PinjamBuku> data = new ArrayList();
    
     public PinjamBukuDao(){
        data.add(new PinjamBuku("A123", "B001", "6-JUNI-2024", "10-JUNI-2024", 0, 0));
        data.add(new PinjamBuku("A124", "B002", "6-JUNI-2024", "20-JUNI-2024", 7, 35000));      
    }
     
     public void insert(PinjamBuku pinjambuku){
        data.add(pinjambuku);
    }
    
    public void update(int index, PinjamBuku pinjambuku){
        data.set(index, pinjambuku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public PinjamBuku getPinjam(int index){
        return data.get(index);
    }
    
    public List<PinjamBuku> getAll(){
        return data;
    }
    
}

