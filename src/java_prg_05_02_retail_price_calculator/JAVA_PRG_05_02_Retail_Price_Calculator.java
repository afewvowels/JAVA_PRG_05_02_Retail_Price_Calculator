/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_05_02_retail_price_calculator;

import java.util.Scanner;
/**
 *
 * @author bluebackdev
 */
public class JAVA_PRG_05_02_Retail_Price_Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        calculateRetailPrice(getItemPrice(), getItemMarkup());
    }
    
    public static double getItemPrice()
    {
        double dblPrice;
        
        Scanner scrKeyboard = new Scanner(System.in);
        
        System.out.print("Please enter the item's cost: $");
        
        dblPrice = scrKeyboard.nextDouble();
        
        return dblPrice;
    }
    
    public static double getItemMarkup()
    {
        double dblMarkup;
        
        Scanner scrKeyboard = new Scanner(System.in);
        
        System.out.print("Please enter the item's markup by percent: ");
        
        dblMarkup = scrKeyboard.nextDouble();
        
        dblMarkup = dblMarkup / 100.0;
        
        return dblMarkup;
    }
    
    public static void calculateRetailPrice(double dblPrice, double dblMarkup)
    {
        double dblRetail;
        
        dblRetail = dblPrice + (dblPrice * dblMarkup);
        
        System.out.println("With a wholesale cost of $" + dblPrice + " and a" +
                " markup of " + (dblMarkup * 100) + "%, the retail price is: $" +
                dblRetail);
    }
}
