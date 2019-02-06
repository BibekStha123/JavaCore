package ProblemSolving;

import java.util.Scanner;

public class QuadrantDetermine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the X-coordinate:");
		float x = sc.nextFloat();
		System.out.println("Enter the Y-coordinate:");
		float y = sc.nextFloat();
		if(x==0 && y ==0)
		{
			System.out.println("These points lies in a origin");
		}
		else
		{
			if(x>0 && y>0 || x>0 && y==0 || x==0 && y>0)
			{
				System.out.println("These points lies in 1st quadrant");
			}
			else if(x<0 && y==0 || x<0 && y>0 )
			{
				System.out.println("These points lies in 2nd quadrant");
			}
			else if(x==0 && y<0 || x<0 && y<0 )
			{
				System.out.println("These points lies in 3rd quadrant");
			}
			else
			{
				System.out.println("The points lies in 4th quadrant.");
			}
		}
	}

}
