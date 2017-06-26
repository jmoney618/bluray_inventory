/* Disc is a subclass of BluRay
 * This subclass will contain a method that will calculate a restocking fee
 * for the number of Blu-Ray discs returned
 *
 * @author Jose A Quinones Jr
*/
package com.inventory;

import java.text.NumberFormat;

public class Disc extends BluRay {

    private String genre;
    private double discReturnTotal;
    private final double restockFee = 0.05;

    // Disc constructor takes the BluRay constructor and adds genre as a parameter
    public Disc(String nam, String num, int unit, double pri, String genre){
        super(nam, num, unit, pri);
        this.genre = genre;
    }

    public String getGenre(){
        return genre;
    }

    public double discReturnTotal(){
        discReturnTotal = calcValue() * restockFee;

        return discReturnTotal;
    }

    @Override
    public String toString(){
        // number formatter to display price and value as currency
        NumberFormat UScurrency = NumberFormat.getCurrencyInstance();

        return "The value of the inventory of " + getUnits() + " units of " + getName() +
                "(inventory #" + getID() + ", " + getGenre() +") and a 5% restocking fee is " +
                UScurrency.format(discReturnTotal() + calcValue());
                /*"Each unit is priced at " +
               UScurrency.format(getPrice()) + ".\n" +
               "The entire inventory of " + name + " is " +
               UScurrency.format(calcValue()) + "\n";*/
    }
}

