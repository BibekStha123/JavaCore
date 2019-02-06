package ProblemSolving;

public class NestedLoop {

	public static void main(String[] args) {
		
		System.out.println("First Triangle");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
				
			{
				System.out.print("*");
			}
			System.out.println();
				
		}
		
		System.out.println();
		System.out.println("opposite triangle");
		for(int i=1;i<=5;i++)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Second Triangle");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			
			for(int k=5;k>i;k--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println("top to bottom");
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j);
			}
			
			for(int k=1;k<i;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//54321
		//4321
		//321
		//21
		//1
		System.out.println("next one,,,");
		for(int i=5;i>=1;i--)
			
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print("*");
//			}
			System.out.println();
		}
		
		System.out.println("Binary format");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print(0);
				}
				else
				{
					System.out.print(1);
				}
			}
			System.out.println();
		}
		
		
		System.out.println("Increasing order");
		int k=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
	
	}

}
