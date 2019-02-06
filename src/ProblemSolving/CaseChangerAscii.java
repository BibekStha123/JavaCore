package ProblemSolving;

public class CaseChangerAscii {

	public static void main(String[] args) {
		
		String st = "ThiS is a coding";  //StringBuilder sb = new StringBuilder(str) to convert string to stringbuilder
		System.out.println(change(st));  //String s = sb.toString() to string from stringbuilder
		
		
	}
	
	public static String change(String st)
	{
		String r = null; // StringBuilder can be used and  append keyword instead of add,,,,,,
		char [] ch = st.toCharArray();
		for(char i : ch)
		{
			int num = (int)i;
			System.out.println(num);
			
			if(num>=65&&num<=65+25) {
				
				r+=(char)(num-65+97);
				
			}
			else if(num>=97&&num<=97+25)
		    {
				r+=(char)(num-97+65);
			}
			
			else
			{
				r+=(char)num;
			}
		}
	
		
		
		return r;
	}

}
