/*
 *This program will track the inventory of Blu-ray discs
 *Discs will be categorized by product name, product number, amount in stock
 *the price of each unit, and the value of the inventory
 *
 * @author Jose A Quinones Jr
*/

package com.inventory;

import static com.inventory.BluRay.inventoryValue;
import static com.inventory.BluRay.sortArray;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Inventory {

    public static void main(String[] args) {

        // instantiate a window for the program
        JFrame window = new JFrame("Blu-ray Movie Inventory");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(620, 550);
        window.setVisible(true);

        JPanel panel = new JPanel();

        BluRay[] movies = new BluRay[5];

        movies[0] = new BluRay("Man of Steel", "48461", 24, 17.99);
        movies[1] = new BluRay("Fast Five", "84624", 10, 12.99);
        movies[2] = new BluRay("Batman Begins", "15483", 19, 13.98);
        movies[3] = new BluRay("X-Men", "48973", 6, 15.99);
        movies[4] = new BluRay("The Outsiders", "01893", 16, 9.98);

        // display message to the user
        System.out.printf("%s\n", "         BLU-RAY MOVIE INVENTORY PROGRAM");
        System.out.printf("%s\n%s\n", "     This program will sort your Blu-ray movie",
                "collection and also give you the collection's value.");
        System.out.println("----------------------------------------------------------");

        // loop to print through the BluRay movies array
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i]);
        }

        sortArray(movies);
        inventoryValue(movies);
        System.out.println("----------------------------------------------------------");

        // loop to print the sorted BluRay movies array
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i]);
        }
        System.out.println("----------------------------------------------------------");

        // overwrite the BluRay array with parameters for Disc object
        movies[0] = new Disc("Man of Steel", "48461", 24, 17.99, "Superhero");
        movies[1] = new Disc("Fast Five", "84624", 10, 12.99, "Action");
        movies[2] = new Disc("Batman Begins", "15483", 19, 13.98, "Superhero");
        movies[3] = new Disc("X-Men", "48973", 6, 15.99, "Superhero");
        movies[4] = new Disc("The Outsiders", "01893", 16, 9.98, "Drama");

        // loop to print the new array including the new genre parameter
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i]);
        }
    }
}