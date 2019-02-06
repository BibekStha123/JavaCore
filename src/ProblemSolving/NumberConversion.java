package ProblemSolving;

import java.util.Scanner;

public class NumberConversion {

	public static void main(String[] args) {
		
		//Decimal to Binary
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a =sc.nextInt();
		
		String st = Integer.toBinaryString(a);
		System.out.println("the binary form using method is: "+st);
		
		//without using toBinaryString,,,
		System.out.println("Enter the number again");
		int num =sc.nextInt();
		int count = 0;
		int binary[]= new int[32];
		
		while(num>0)
		{
			binary[count++]=num%2;
			num=num/2;
			
		}
		
		System.out.println("the binary form without using method is: ");
		for(int i=count-1;i>=0;i--)
		{
			System.out.print(binary[i]);
		}
		System.out.println();
		
		
		//again to decimal,,
		System.out.println("the decimal  is: "+todeci(binary));
		
		
		
		//Taking the input for binary into decimal,,,
				
		System.out.println("Enter the binay number");
		String s = sc.next();
		
		System.out.println(s);
		int in = Integer.parseInt(s);
		int [] ary = new int[s.length()];
		int i =0;
		while(in>0)
		{
			int v = in%10;
			ary[i++]=v;
			in=in/10;
		}
		
		
			
		System.out.println(todeci(ary));
		

	
		
	}
	
	public static int todeci(int bin[])
	{
	
		int n =bin.length;
		int s=0;
		for(int i=0;i<n;i++)
		{
			s+=bin[i]*Math.pow(2, i);
		}
		
		return s;
		
	}

}
