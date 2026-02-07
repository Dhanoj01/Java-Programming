import java.util.Arrays;
import java.util.List;

public class practise {

	//list all odd check
	
	public static void main(String args[])
	{
		
		List<Integer> number = Arrays.asList(1,3,5);
		
		boolean allOdd = true;
		
		for(int n : number)
		{
			if(n%2==0)
			{
				allOdd = false;
				break;
			}
			else
			{
				continue;
			}
		}
		
		
		if(allOdd)
		{
			System.out.println("All odd number in the list");
			
		}
		
		else
		{
			System.out.println("Mix or even in the list");
		}
	}
	
}
