package ProblemSolving;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		
	
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
	    int a=sc.nextInt();
	    int ary[] = new int[a];
	    int mul=1;
	    System.out.println("enter the numbers in an array");
	    for(int i=0;i<ary.length;i++)
	    {
	    	ary[i] = sc.nextInt();
	    }
	    
	    
	    for(int i =0; i<ary.length;i++) {
	    int  num = ary[i];

            System.out.println("multiplication table for "+num);

		    for(int j =1; j<=10;j++) {
		    	
		    System.out.println(num +"*"+j +"="+(num*j));
		    	
		    	
		    }

	    }
            
           
        }
        
         
            public int mul(int a, int b)
            {
                return a*b;
            }
}
