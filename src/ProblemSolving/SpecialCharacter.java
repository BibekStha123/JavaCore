package ProblemSolving;

import java.util.Scanner;

public class SpecialCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the strings");
		String st = sc.nextLine();
		
		char [] chr = st.toCharArray();
		reverse(chr);
		String rev = new String(chr);
		System.out.println("output: "+rev);
		
	}

	public static void reverse(char [] chr)
	{
		
		int r = chr.length-1,l=0;
		while(r>l)
		{
			if(!Character.isAlphabetic(chr[l]))
			{
				l++;
			}
			else if(!Character.isAlphabetic(chr[r]))
			{
				r--;
			}
			else
			{
				char t = chr[l];
				chr[l]=chr[r];
				chr[r]=t;
				l++;
				r--;
			}
		}
		
	}
	
}
