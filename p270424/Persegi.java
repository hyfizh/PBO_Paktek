/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatur.pbo2201082005.p270424;

/**
 *
 * @author maulana hazanniakbar
 */
public class Persegi implements Relation{
    public Persegi(){    
    };
    
    public int sisi;
    
    public Persegi(int sisi){
        this.sisi = sisi;
    }
    
    public int getLuas(){
        int Luas = sisi * sisi;
        return Luas;
    }
    
    @Override
    public boolean isGreater(Object a, Object b){
        int aLuas = ((Persegi) a).getLuas();
        int bLuas = ((Persegi) b).getLuas();
        return (aLuas > bLuas);
    }
    
    @Override
    public boolean isLess(Object a, Object b){
        int aLuas = ((Persegi) a).getLuas();
        int bLuas = ((Persegi) b).getLuas();
        return (aLuas > bLuas);
    }
    
    @Override
    public boolean isEqual(Object a, Object b){
        int aLuas = ((Persegi) a).getLuas();
        int bLuas = ((Persegi) b).getLuas();
        return (aLuas > bLuas);
    }
    
}
