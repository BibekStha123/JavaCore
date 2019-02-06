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
public class KMPSir {
    public static void main(String[] args) {
        String txt = "abbbaccbaccd";
        String ptr = "ac";
        
        int i=0,j=0, counter=0, index=0;
        int tlen = txt.length();
        int plen = ptr.length();
        while(i<tlen){
            if(txt.charAt(i)==ptr.charAt(i)){
                i++;
                j++;
                if(plen==j){
                    counter++;
                }
            }else{
                i=++index;
                j=0;
            }
        }
        
        System.out.println(counter);
    }
}
