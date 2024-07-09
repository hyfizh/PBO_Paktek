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
public class BukuDao {
    private List<Buku> data = new ArrayList();
    
   public BukuDao() {
        data.add(new Buku("A001", "Teruntuk Masa Kecil dan Aku di Kemudian Hari", "Rofie Fauzie", "gagasmedia", 2023));
        data.add(new Buku("B002", "Sebuah Seni untuk Bersikap Bodo Amat", "Mark Manson", "Gramedia Widiasarana Indonesia", 2018));
    }
    public void insert(Buku buku){
        data.add(buku);
    }
    
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    public List<Buku> getAll(){
        return data;
    } 
}
