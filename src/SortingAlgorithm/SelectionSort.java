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
public class SelectionSort {
    public static void main(String[] args) {
        int [] ary = {5,10,6,4,20,3};
        int min,i=0,k=0, temp=0;
        
        while(i<ary.length){
            min=i;
            for(int j=i+1;j<ary.length;j++){
                if(ary[j]<ary[min]){
                    min=j;
                }
            }
            temp=ary[min];
            ary[min]=ary[i];
            ary[i]=temp;
            
            while(k<ary.length){
                System.out.printf("%d\t", ary[k]);
                k++;
            }
            
            System.out.println(i+" iteration");
            k=0;
            i++;
        }        
    }
}
