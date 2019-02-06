package ProblemSolving;

import java.util.Scanner;

//Q. Write a Java programme which reads two integers, two float values and two string data ("123", "999") from the terminal 
//and then passes these values through an add() operation one by one. Display the final result.
public class Solution {

	public static void main(String[] args) {
		
		calculator c= new calculator();
		c.add(2, 3);
		c.add(3.2f,2.23f);
		c.add("22323", "32455");
		
	}

}

class calculator
{
	public void add(int a,int b)
	{
		System.out.printf("the integers are: %d %d ", a,b);
		System.out.println(a+b);
	}
	
	public void add(float f1, float f2)
	{
		System.out.printf("the floats are: %f %f",f1,f2);
		System.out.println(f1+f2);
	}
	
	public void add(String s1,String s2)
	{
		System.out.printf("the strings are: %s %s",s1,s2);
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		
		System.out.println(a+b);
	}
}
