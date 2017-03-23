/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cci;

import com.jordan.cdp.Tradutor;
import com.jordan.cgt.AplCalcular;
import com.jordan.cih.Tela;
import java.util.Scanner;

/**
 *
 * @author Jordan
 */
public class ControleCalculadora {    
    private static Scanner ler = new Scanner(System.in);
    private static AplCalcular calcular = new AplCalcular();
       
    public void Inicia(){        
        String expressaoPolonesa;
        expressaoPolonesa = Tela.digitar(ler);
        
        Executa(expressaoPolonesa);
    }
    
    public void Executa(String expressao){
        int resultado;
        String expressaoPolonesa;
        Tradutor tradutor = new Tradutor();
        
        expressaoPolonesa = tradutor.traduzir(expressao);
        
        resultado = calcular.resultado(expressaoPolonesa);
        
        //mostra o resultado na tela
        Tela.imprimir(resultado);
        
        ler.close();
    }    
}