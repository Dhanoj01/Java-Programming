package String;

public class LeadingTrailingSpace {

	public static void removeSpace(String str)
	{
		
		 str = str.strip();
		
		System.out.println(" Answer :"+str);
		
	}
	
	public static void main(String[] args) {
		
		String str = "  abc % kf ";
		
		removeSpace(str);
	}

}
