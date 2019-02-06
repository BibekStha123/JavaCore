package ProblemSolving;

import java.util.Scanner;

public class SplitingNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers as string");
		
		String st =sc.next();
		int count=0;
		int num = Integer.parseInt(st);
		int [] ary = new int[st.length()];
		
		while(num>0)
		{
			int val = num%10;
			ary[count++]=val;
			num=num/10;
		}
		
		for(int i=count-1;i>-1;i--)
		{
			System.out.println(ary[i]);
		}
	}

}
