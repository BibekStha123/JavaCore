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
public class DuplicateArray {
    public static void main(String[] args) {
        
        int [] ary = {1,3,3,4,5,6,6};
        
        int [] temp = new int[ary.length];
        
        int j=0;
        
        for(int i=0;i<ary.length-1;i++){
            if(ary[i]!=ary[i+1]){
                temp[j]=ary[i];
                j++;
            }
        }
        temp[j]=ary[ary.length-1];
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
   }
}
