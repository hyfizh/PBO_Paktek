
package com.fatur.pbo2201082005.p040624;

import java.util.ArrayList;
import java.util.List;


public class AnggotaDao {
    private List<Anggota> data = new ArrayList();
    
    public AnggotaDao() {
        data.add(new Anggota("A001", "Ali", "Padang", "L"));
        data.add(new Anggota("A002", "Ani", "Padang", "P"));
    }
    public void insert(Anggota anggota){
        data.add(anggota);
    }
    
    public void update(int index, Anggota anggota){
        data.set(index, anggota);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Anggota getAnggota(int index){
        return data.get(index);
    }
    public List<Anggota> getAll(){
        return data;
    }
}
