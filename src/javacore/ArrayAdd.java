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
public class ArrayAdd {
    public static void main(String[] args) {
        
        int [] ary = {12,34,2,11,9};
        
        int pos =3;   
        int num=90; 
        int j =0;
        
        int [] ary1 = new int[ary.length+1];
        
        for(int i=0;i<=pos;i++){
            ary1[i]=ary[i];
            if(pos==i){
                ary1[i]=num;
            }            
        }   
        
        for(int i=pos+1;i<ary1.length;i++){
            ary1[i]=ary[i-1];
        }
        
        
        for(int i=0;i<ary1.length;i++){
        System.out.println(ary1[i]);
        }
        
    }
}
