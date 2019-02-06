package ProblemSolving;

import java.util.Scanner;

public class SplitingSentence {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sen = sc.nextLine();
		String [] w = sen.split(" ");
		for(String s : w)
		{
			System.out.println(s);
		}
	}

}
