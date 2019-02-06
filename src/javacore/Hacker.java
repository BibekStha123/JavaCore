/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore;

import java.util.Scanner;

/**
 *
 * @author BibekShrestha
 */
public class Hacker {
    public static void main(String[] args) {
        
        display(10.25, 17, 5);
    }
    
    public static void display(double meal, int tip, int tax){
        double a = tip*(meal/100);
        double b = tax*(meal/100);
        
        meal=meal+a+b;
        int m = (int)meal;
        System.out.println(meal);
    }
}
