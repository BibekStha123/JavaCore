package ProblemSolving;

import java.util.Scanner;
//divisor and factor are the same thing....
public class SumOfDivisor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int sum=0;
	    for(int i=1;i<=a;i++)
	    {
	    	if(a%i==0)
	    	{
	    		System.out.println(i);
	    		sum+=i;
	    	}
	    }
	    System.out.println("the sum is: "+sum);
		
	}

}
