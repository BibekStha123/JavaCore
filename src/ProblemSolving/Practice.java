package ProblemSolving;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		int choice;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.print("Options: \n1.Addition\n2.Substraction\n3.Division\n4.Multiplication\n");
        
        System.out.println("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("Enter your choice");	
        choice =sc.nextInt();
        int result;
        switch(choice)
        {
        case 1:
        	result=a+b;
        	System.out.println("The addition is: "+result);
        	break;
        	
        case 2:
        	result=a-b;
        	System.out.println("The substraction is: "+result); 
        	break;
        	
        case 3:
        	result=a/b;
        	System.out.println("The division is: "+result);
        	break;
        	
        case 4:
        	result=a*b;
        	System.out.println("The multiplication is: "+result);
        	break;
        
        case 5:
        	System.exit(1);
        	break;
        	
       default:
    	   System.out.println("your choice is wrong,");
    	   break;
        }
		} while(choice!=6);
	
	}

}
