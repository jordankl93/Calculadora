/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cih;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Jordan
 */
public class Tela {
    
    public static String digitar(Scanner s) throws NoSuchElementException {
        
        System.out.println("Digite a expressao polonesa p/ calculadora: ");
        return s.nextLine();
    
    }
    
    public static void imprimir(int resultado) throws NoSuchElementException {
        
        System.out.println("Resultado = " + resultado);    
    }
    
}
