/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatur.pbo2201082005.p270424;

/**
 *
 * @author maulana hazanniakbar
 */
public class MyInteger implements Relation{
    @Override
    public boolean isGreater(Object a, Object b){
        return (int)a > (int)b;
    }
    @Override
    public boolean isLess(Object a, Object b){
        return (int)a < (int)b;
    }
    @Override
    public boolean isEqual(Object a, Object b){
        return (int)a == (int)b;
    }
}