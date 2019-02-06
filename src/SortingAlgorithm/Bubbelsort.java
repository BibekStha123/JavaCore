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
public class Bubbelsort {

    public static void main(String[] args) {
        int[] num = {36, 19, 29, 12, 5};
        int k =0;
        
        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length; j++) {                
                    if (num[j-1] > num[j]) {
                        int tmp;
                        tmp = num[j-1];
                        num[j-1] = num[j];
                        num[j] = tmp;
                }
            }
            while(k<num.length){
                System.out.printf("%d\t", num[k]);
                k++;
            }
            
            System.out.println(i+" iteration");
            k=0;
        }

        for (int i = 0; i < num.length; i++) {
            System.out.printf("%d\t", num[i]);
        }
    }
}
