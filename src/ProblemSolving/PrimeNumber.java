package ProblemSolving;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the number.");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean prime = true;
		for(int i=2; i<a/2;i++)
		{
			if(a%i == 0)
			{
				prime = false;
				break;
			}
		}
		
		if(prime)
		{
			System.out.println(a+" is prime number");
		}
		
		else
		{
			System.out.println(a+" is not a prime number");
		}
	}

}
