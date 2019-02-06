/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IncludeHelp;

import java.util.Scanner;

/**
 *
 * @author BibekShrestha
 */
public class LastIndex {

    public static void main(String[] args) {

        String str = "ababbabbaa";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the character");
        String st = scan.nextLine();
        char c = st.charAt(0);
        
        
        char [] chr = str.toCharArray();
        int i=0;
        int index=0;
        while(i<chr.length){
            
            System.out.println(c+" comparing with: "+chr[i]);
            if(c==chr[i]){
                
                index=i;
                
            //System.out.println("the value matched at index "+index);
            }
            i++;
        }
        
        System.out.printf("the last index of %s is %d \n: ",c, index);
        
    }
}
