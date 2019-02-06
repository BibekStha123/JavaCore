/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAlgorithm;

/**
 *
 * @author BibekShrestha
 */
public class KMP {
    public static void main(String[] args) {
        
        String ptr = "aaaabaacd";
        int plen = ptr.length();
        int lps[] = new int[plen];
        
        computeLps(ptr, plen, lps);
       
    }
    
    public static void computeLps(String ptr, int plen, int lps[]){
     
        int i=1;
        int j=0;
        lps[0]=j;
        
        
         
        while(i<plen){
            if(ptr.charAt(i)==ptr.charAt(j)){
                j++;
                lps[i]=j;
                i++;
            }else{
                i++;
                j=0;
            }
        }
        for(int k =0;k<lps.length;k++){
            System.out.print(lps[k]);
        }
        System.out.println("");
    }
}
