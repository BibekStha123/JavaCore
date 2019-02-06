package ProblemSolving;

import java.util.Stack;

public class ValidatingBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "({{}{}{{{)})";
		System.out.println(valid(st));
		
	}

	public static boolean valid(String st)
	{
		String open="[{(", close=")}]";
		Stack<Character> stk = new Stack<Character>();
		for(int i=0;i<st.length();i++)
		{
			if(open.indexOf(st.charAt(i))>=0)
			{
				stk.push(st.charAt(i));
			}
			if(close.indexOf(st.charAt(i))>=0)
			{
				if(stk.size()>0)
				{
					if(!(matched(stk.pop(), st.charAt(i))))
					{
						return false;
					}
				}
				else
				{
					return false;
				}
			}
			
		}
		return true;
	}
	
	public static boolean matched(char a, char b)
	{
		if(a=='[' && b==']')
			return true;
		if(a=='{' && b=='}')
			return true;
		if(a=='(' && b==')')
			return true;
		
		return false;
	}
}
