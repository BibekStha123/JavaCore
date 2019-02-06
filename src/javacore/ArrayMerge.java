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
public class ArrayMerge {
    public static void main(String [] args){
        
        
        int i=0,j=0, index=0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int first = scan.nextInt();
        int [] a = new int[first];  
        
        System.out.println("Enter the elements in an array");
        for(i=0;i<first;i++)
        {
            a[i]=scan.nextInt();
        }
        
        System.out.println("Enter the size of second array");
        int second = scan.nextInt();
        int [] b = new int[second];
        
        System.out.println("Enter the elements in an array");
        for(i=0;i<second;i++)
        {
            b[i]=scan.nextInt();
        }
        

        

        int c_len = a.length+b.length;
        
        int [] c =new int [c_len];
        
        System.out.println(c_len);
        
        for(i=0;i<first;i++){
            c[i]=a[i];
        }
        
        for( i=0;i<second;i++){
            c[first+i]=b[i];
        }

              
        System.out.println("merge: ");
        for(index=0;i<c_len;i++){
        System.out.println(c[i]);
        }
        
    }
}
