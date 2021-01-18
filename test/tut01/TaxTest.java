package tut01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.Test;
import static org.junit.Assert.*;

import sqa_tut01.Tax;

/**
 *
 * @author Win 8.1 Version 2
 */
public class TaxTest {
    
    @Test
    public void taxCalculationPreTax(){
        Tax t = new Tax();
        double expectedPrice = 12;
        assertEquals(11.42, t.calculatePreTax(expectedPrice), 0.01);
    
    }
}
