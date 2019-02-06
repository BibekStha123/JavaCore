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
public class InsertionSort {

    public static void main(String[] args) {

        int[] ary = {5, 10, 6, 4, 20, 3};

        int i=1;
        while(i<ary.length) {
            for (int j = 0; j < i; j++) {
                if (ary[j] > ary[i]) {
                    int temp = ary[i];
                    ary[i] = ary[j];
                    ary[j] = temp;
                }
                
            }

            for (int k= 0; k < ary.length; k++) {
                System.out.printf("%d \t", ary[k]);
            }
            
            System.out.println("iteration: "+i);
            i++;
        }

    }
}
