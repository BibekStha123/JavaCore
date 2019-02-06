package ProblemSolving;

import java.util.Scanner;

public class FIbonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a =sc.nextInt();
		System.out.println("the fibonacci is: "+fibo(a));
	
	}

	public static int fibo(int a)
	{
		if(a==0)
			return 0;
		else if(a==1)
			return 1;
		else
			return fibo(a-1)+fibo(a-2);
	}
	
}

