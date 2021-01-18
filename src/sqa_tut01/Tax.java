/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqa_tut01;

/**
 *
 * @author Win 8.1 Version 2
 */
public class Tax {

    /**
     * @param args the command line arguments
     */
    public double calculatePreTax(double expectedPrice) {
        if (expectedPrice < 100.0)
            return Math.round(expectedPrice/1.05*100.0)/100.0;
        else
            return Math.round(expectedPrice/1.1*100.0)/100.0;
    }
    
    
}
