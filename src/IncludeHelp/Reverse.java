/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IncludeHelp;

/**
 *
 * @author BibekShrestha
 */
public class Reverse {

    public static void main(String[] args) {
        String str = "hello how are you";

        String[] strary = str.split(" ");
        String rev = "";

        String[] string = new String[strary.length];
        for (String s : strary) {
            char[] chr = s.toCharArray();
            for (int i = chr.length - 1; i > -1; i--) {
                rev += s.charAt(i);
            }
            rev += " ";
        }

        System.out.println(rev);
    }
}
