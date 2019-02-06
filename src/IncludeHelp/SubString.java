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
public class SubString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scan.next();
        index(str, 3, 5);
    }

    public static void index(String s, int first, int last) {
        char[] ch = s.toCharArray();
        String subString = "";
        if (first > ch.length || last > ch.length) {
            System.out.println("the index you entered exceeds");
        } else {
            for (int i = 0; i < ch.length; i++) {
               // System.out.println(ch[i]);
                if(first==i || last==i){
//                    System.out.println(ch[first]);
//                    System.out.println(ch[last]);
                        for(int k=first;k<=last;k++){
                            //System.out.println(char[k]);                            
                            subString+=s.charAt(k);
                            System.out.println(subString);
                        }
                }
            }
        }
    }
}
