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
public class Ascending {

    public static void main(String[] args) {
        int[] ary = {21, 434, 23, 44, 2, 5};

        for (int i = 0; i < ary.length; i++) {
            for (int j = i+1; j < ary.length; j++) {

                if (ary[i] > ary[j]) {
                    int t = ary[i];
                    ary[i] = ary[j];
                    ary[j] = t;
                }
            }
        }

        System.out.println("sorted array is: ");
        for (int i = 0; i < ary.length; i++) {
            System.out.println(ary[i]);
        }
    }
}
