/* This is the Blu-ray class that will store of the inventory information
 * This class is also a superclass of class Disc
 *
 * @author Jose A Quinones Jr
*/

package com.inventory;

import java.text.NumberFormat;
import java.util.Arrays;

public class BluRay implements Comparable<BluRay>{

    private String name; // name of movie
    private String numberID; // ID or SKU number
    private int units; // amount of units
    private double price; // price of each unit
    private double value; // value of all units of paticular movie

    // BluRay constructor
    public BluRay(String nam, String id, int unit, double pri){

        name = nam;
        numberID = id;
        units = unit;
        price = pri;
    }

    public void setName(String nam){
        name = nam;
    }

    public String getName(){
        return name;
    }

    public void setID(String id){
        numberID = id;
    }

    public String getID(){
        return numberID;
    }

    public void setUnits(int unit){
        units = unit;
    }

    public int getUnits(){
        return units;
    }

    public void setPrice(double pri){
        price =  pri;
    }

    public double getPrice(){
        return price;
    }

    public double calcValue(){

        value = getUnits() * getPrice();

        return value;
    }

    public static void sortArray(BluRay[] movie){
        Arrays.sort(movie);
    }

    public static void inventoryValue(BluRay[] movie){
        double total = 0.0;
        NumberFormat UScurrency = NumberFormat.getCurrencyInstance();

        for (BluRay movie1 : movie) {
            total += movie1.value;
        }

        System.out.println("The value of the inventory is " +
                UScurrency.format(total));
    }

    @Override
    public int compareTo(BluRay sortBluRay){
        return this.name.compareTo(sortBluRay.name);
    }

    @Override
    public String toString(){
        // number formatter to display price and value as currency
        NumberFormat UScurrency =  NumberFormat.getCurrencyInstance();

        return "There are " + getUnits() + " units of " + getName() +
                "(inventory #" + getID() + ").\n"+ "Each unit is priced at " +
                UScurrency.format(getPrice()) + ".\n" +
                "The entire inventory of " + getName() + " is " +
                UScurrency.format(calcValue()) + "\n";
    }
}