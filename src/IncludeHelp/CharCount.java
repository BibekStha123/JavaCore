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
public class CharCount {
    public static void main(String[] args) {
        String str = "abcbbca";
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the char to search");
        String st = scan.nextLine();
        char c = st.charAt(0);
        char [] ch = str.toCharArray();
        
        int count =0;
        
        for(int i=0;i<ch.length;i++){
            if(c==ch[i]){
                count++;
            }
        }
        System.out.println(c+" matched "+count+" times");
    }
}
