/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.cdp;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author Jordan-PC
 */
public class TradutorSteps {
    
    private String expressaoNatural = "";
    private String expressaoPolonesa = "";
    
    Tradutor tradutor;    

    public TradutorSteps() {
        this.tradutor = new Tradutor();
    }
        
    @Given("^Eu tenho a expressao \"([^\"]*)\"$")
    public void euTenhoAExpressao(String expressao) throws Throwable {        
        this.expressaoNatural = expressao;
    }

    @When("^Eu quero converter para uma expressao polonesa$")
    public void euQueroConverterParaUmExpressaoNormal() throws Throwable {
        expressaoPolonesa = tradutor.traduzir(expressaoNatural);        
    }

    @Then("^Eu tenho como resultado \"([^\"]*)\"$")
    public void euTenhoComoResultado(String resultadoEsperado) throws Throwable {
        assertThat(expressaoPolonesa, is(resultadoEsperado));
    }

}
