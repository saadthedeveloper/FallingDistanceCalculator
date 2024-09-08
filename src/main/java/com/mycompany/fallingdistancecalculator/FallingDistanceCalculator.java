/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fallingdistancecalculator;
import javax.swing.JOptionPane;
/**
 *
 * @author msaad
 */
public class FallingDistanceCalculator {

    public static void main(String[] args) {
        double time;
        double distance;
        String input;
        
        input = JOptionPane.showInputDialog("Enter the time it took for the object to fall");
        time = Double.parseDouble(input);
        
        distance = fallingDistance(time);
        
        JOptionPane.showMessageDialog(null, "The distance is " + distance + " meters");
    }
    public static double fallingDistance(double time)
    { 
        double distance = 0.5 * (9.8 * Math.pow(time, 2));
        return distance;
    }
}
