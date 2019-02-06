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
public class StringCount {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scan.nextLine();

        
        //String[] ary = removeSpace(str);

        String [] ary = str.split(" ");
        int count = 0;

        for (int i = 0; i < ary.length; i++) {
            count = i;
        }
        System.out.println((count + 1));
    }

//    public static String[] removeSpace(String str) {
//
//        String[] ary = new String[str.length()];
//        int i = 0;
//        while (i < ary.length) {
//            if (!str.contains(" ")) {
//                ary[i]=str;
//            }
//            i++;
//        }
//        
//        return ary;
//    }
}
