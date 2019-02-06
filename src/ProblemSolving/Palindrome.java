package ProblemSolving;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String a = sc.nextLine();
		String rev = "";
		for(int i= a.length() -1;i>=0;i--)
		{
			rev+=a.charAt(i);
		}

		if(rev.equals(a))
		{
			System.out.println("the entered string is palindrome");
		}
		else
		{
			System.out.println("the entered string is not a palindrome");
		}
	}

}
