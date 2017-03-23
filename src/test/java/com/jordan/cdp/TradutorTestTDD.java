/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cdp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jordan-Not
 */
public class TradutorTestTDD {
    Tradutor tradutor;    
    
    @Before
    public void before() {
        tradutor = new Tradutor();
    }
    
    /**
     * Test of traduzir method, of class Tradutor.
     */
    @Test
    public void testTraduzirSimples() {        
        String expressaoNatural = "( 1 + 1 )";
        String expResult = "1 1 +";
        String result = tradutor.traduzir(expressaoNatural);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTraduzirMedio() {        
        String expressaoNatural = "( ( 1 + 1 ) * 2 )";
        String expResult = "1 1 + 2 *";
        String result = tradutor.traduzir(expressaoNatural);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTraduzirAvancado() {        
        String expressaoNatural = "2 * 3 + 4 * ( 5 - 6 )";
        String expResult = "2 3 * 4 5 6 - * +";
        String result = tradutor.traduzir(expressaoNatural);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTraduzirParentesesInternos() {        
        String expressaoNatural = "2 * ( ( 3 + 4 ) + ( 5 - 6 ) )";
        String expResult = "2 3 4 + 5 6 - + *";
        String result = tradutor.traduzir(expressaoNatural);
        assertEquals(expResult, result);
    }
    
}
