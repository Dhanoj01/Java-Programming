package String;

public class RemoveSpace {

	public static String removeWhiteSpace(String s)
	{
		StringBuilder output = new StringBuilder();

		char c[] = s.toCharArray();

		for(char i : c)
		{
			if(!Character.isWhitespace(i))
			{
				output.append(i);
			}
		}

		return output.toString();
	}

	public static void main(String args[])
	{
		String s = "Dimpal kumari jamuaon ";
		
		System.out.println(removeWhiteSpace(s));

	}
}
