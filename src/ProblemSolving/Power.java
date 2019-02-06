/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.util.Scanner;

/**
 *
 * @author BibekShrestha
 */
public class Power {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base");
        int a = scan.nextInt();
        System.out.println("Enter the power");
        int b = scan.nextInt();
        
        double result = 1;
        
//        for(int i =1; i<=b;i++){
//            result=result*a;
//        }
              
        while(b>0){
            result = result*a;
            b--;
        }
        
        System.out.println(result);
        
    }
}
