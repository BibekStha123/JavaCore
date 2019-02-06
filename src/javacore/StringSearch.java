/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore;

/**
 *
 * @author BibekShrestha
 */
public class StringSearch {
    public static void main(String[] args) {
        
        String string = "abcabbbcabccccabc";
        String text = "abc";
        
        int strlen= string.length();
        int textlen= text.length();
        
        int i=0,j=0,index=0;
        int counter =0;
        while(i<strlen){
            char c = string.charAt(i);
            if(c==text.charAt(j)){
                i++;
                j++;
                if(j==textlen){
                    counter++;
                    j=0;
                }
            }else{
                j=0;
                i=++index;
            }
        }  
        
        System.out.println(counter);
    }
}
