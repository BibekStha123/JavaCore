package ProblemSolving;

import java.util.Scanner;

public class MovieSelector {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice");
		String choice = sc.next();
		
		if(choice.length()>1)
		{
			System.out.println("you are not alllow to enter more than one character");
		}
		else
		{
			char ch =choice.charAt(0);
			switch(ch)
			{ 
			case 'a':
			case 'A':	
				System.out.println("action movie");
				break;
			case 'c':
			case 'C':	
				System.out.println("comedy movie");
				break;
			case 'd':
			case 'D':	
				System.out.println("drama movie");
				break;
		    default:
		    	System.out.println("doesnot exist");
			}
		
		}

	}
}

