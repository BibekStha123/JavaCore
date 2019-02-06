/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 *
 * @author BibekShrestha
 */
public class HashSet {
    public static void main(String [] args){
        String[] names = {"nibek", "sujan", "ram", "bijaya", "sujan", "sita", "bijaya"};
        List<String> list = Arrays.asList(names);

        System.out.println(list);

        Set<String> set = new java.util.HashSet<String>(list);
        System.out.println(set);
    }
}
