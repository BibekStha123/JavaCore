package ProblemSolving;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number as string");
		int  a =sc.nextInt();
		int t=a;
		
		
		
		int arm=0;
		while(a>0)
		{
			int val = a%10;
			
			a=a/10;
			arm=arm+val*val*val;
			
		}
		
		System.out.println(arm);
		
		if(t==arm)
		{
			System.out.println("ARMSTRONG");
		}
		else
		{
			System.out.println("NOT STRONG");
		}
		
	}

}
