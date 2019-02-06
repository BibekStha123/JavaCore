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
public class ArrayDelete {

    public static void main(String[] args) {

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int a = scan.nextInt();

        int[] ary = new int[a];
        System.out.println("Enter the elements in an array");
        for (int i = 0; i < a; i++) {
            ary[i] = scan.nextInt();
        }*/
        int[] a = {1, 3, 4, 5, 77, 44, 55, 34, 12, 32};
        int del = 44;

//        int[] b=new int[a.length-1];
//        
//        
//        for(int i=0,j=0;i<a.length;i++){
//            if(del!=a[i]){
//                b[j]=a[i];
//                j++;
//            }
//        }
//        
//        a=b;
//        
//        for(int i =0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
        


        for (int i = 0; i < a.length; i++) {
            if (del == a[i]) {
                    for (int j = i; j < a.length-1; j++) {
                        a[j] = a[j + 1];
                }
            }
        }
        
            for (int i = 0; i < a.length-1; i++) {
                System.out.println(a[i]);
        }
    }
}
