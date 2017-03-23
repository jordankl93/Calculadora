/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cdp;

/**
 *
 * @author Jordan
 */
public class Constante implements Expressao{
    private int valor;
    
    public Constante() {
        
    }
    
    public Constante (int valor){
        this.valor = valor;
    }
    
    @Override
    public int resultado() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }    
    
}
