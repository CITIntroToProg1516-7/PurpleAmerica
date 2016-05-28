/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 *@(#)FillStates.java
 *@Author: Sean LaRochelle
 *@Block: 7
 *@Project: Purple America
 *
 *@Variables: data1 - Holds the number of votes associated with the Republican canidate
 * data2 - Holds the number of votes associated with the Democratic canidate
 * data3 - Holds the number of votes associated with the Indepentent canidate
 * total - Holds the total number of votes
 * red - Holds the amount of red color
 * blue - Holds the amount of blue color
 * green - Holds the amount of green color
 * stateColor - Holds the custom color
 *@Methods: colorStates - Creates a custom color for either the states or counties based on election data
 */
package map;

import edu.princeton.cs.introcs.StdDraw;
import java.io.File;
import java.io.FileNotFoundException;
import edu.princeton.cs.introcs.*;
import java.util.Scanner;
import java.awt.Graphics;
import java.awt.*;
/**
 *
 * @author hcps-larkinch
 */
public class FillStates {
    
    /*
     * Initializes Global Variables
     */
    public FillStates(){
        
    }//End of constructor
    
    public static java.awt.Color colorStates(int[] data) throws FileNotFoundException{
        double data1 = data[0]; //Assigns the first element of the array to data1
        double data2 = data[1]; //Assigns the second element of the array to data2
        double data3 = data[2]; //Assigns the third element of the array to data3
        double total = data1+data2+data3; //Adds the values together to get the total number of votes
       
       
        
        double red = (data1/total); //Gets the float amount of red
        double blue = (data2/total); //Gets the float amount of blue
        double green = (data3/total); //Gets the float amount of green
        
        
        java.awt.Color stateColor = new java.awt.Color((float)red, (float)green, (float)blue);
        //Creates a custom color based on the float values
        
        return stateColor;//Returns the custom color
        
        
        
            
    }//End of colorStates method
    
    
    
}//End of class
