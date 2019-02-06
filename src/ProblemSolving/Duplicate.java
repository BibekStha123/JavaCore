package ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		
		//Integer ary [] = {1,2,4,3,2,1}; Wrapper class should be used
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a =sc.nextInt();
		int [] ary = new int[a];
		System.out.println("Enter the elements in an array");
		for(int i=0;i<a;i++)
		{
			ary[i]=sc.nextInt();
		}
		
		System.out.println("elements are: ");
		for(int i=0;i<a;i++)
		{
			System.out.println(ary[i]);
		}
		
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();
		
		for(int i : ary)
		{
			if(!s1.contains(i))
			{
				s1.add(i);
			}
			else
			{
				s2.add(i);
			}
		}
		System.out.println(s2);
	}

	
}
