/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatur.pbo2201082005.p270424;

/**
 *
 * @author maulana hazanniakbar
 */
public class PersegiPanjang implements Relation{
    public PersegiPanjang(){    
    };
    
    public int lebar;
    public int panjang;
    
    public PersegiPanjang(int lebar, int panjang){
        this.lebar = lebar;
        this.panjang = panjang;
    }
    
    public int getLuas(){
        int Luas = panjang * lebar;
        return Luas;
    }
    
    @Override
    public boolean isGreater(Object a, Object b){
        int aLuas = ((PersegiPanjang) a).getLuas();
        int bLuas = ((PersegiPanjang) b).getLuas();
        return (aLuas > bLuas);
    }
    
    @Override
    public boolean isLess(Object a, Object b){
        int aLuas = ((PersegiPanjang) a).getLuas();
        int bLuas = ((PersegiPanjang) b).getLuas();
        return (aLuas > bLuas);
    }
    
    @Override
    public boolean isEqual(Object a, Object b){
        int aLuas = ((PersegiPanjang) a).getLuas();
        int bLuas = ((PersegiPanjang) b).getLuas();
        return (aLuas > bLuas);
    }
}
