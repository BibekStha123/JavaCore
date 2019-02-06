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
public class AnagramString {

    public static void main(String[] args) {
        
        String n = "mother in law";
        String m = "Hitler Woman";

        String str1 = n.toLowerCase();
        String str2 = m.toLowerCase();

        char[] ch1 = n.toCharArray();
        char[] ch2 = m.toCharArray();

        
        int asum = 0;
        int bsum = 0;
        
//        for (char c : ch1) {
//            int i = (int) c;
//
//            if (i >= 65 && i <= 65 + 25) {
//                str1 += (char) (i - 65 + 97);
//            }
//        }
//        
//        
//        for (char c : ch1) {
//            int i = (int) c;
//
//            if (i >= 65 && i <= 65 + 25) {
//                str2 += (char) (i - 65 + 97);
//            }
//        }

        
//        String a = str1.replaceAll(" ", "");
//        String b = str2.replaceAll(" ", "");



       
        String a = spaceRemover(str1);
        String b = spaceRemover(str2);
        

        int alen = a.length();
        int blen = b.length();


        if (alen != blen) {
            System.out.println(m + " and " + n + " not an anagram");
        } else {
            if (asum == bsum) {
                System.out.println(m + " and " + n + " is an anagram");
            } else {
                System.out.println(m + " and " + n + " not an anagram");
            }
        }
    }
   
    public static String spaceRemover(String str){
        String newStr=null;
        for(char c : str.toCharArray()){
            if(c!=' '){
                newStr+=c;
            }
        }
        return newStr;
    }
}
