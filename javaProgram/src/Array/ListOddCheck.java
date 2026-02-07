package Array;

import java.util.Arrays;
import java.util.List;

public class ListOddCheck {

	public static void main(String args[])
	{
		
		List<Integer>numbers = Arrays.asList(1,3,5,7,9);
		
		boolean allOdd = true;
		
		for(int n : numbers)
		{
			if(n%2==0)
			{
				allOdd = false;
			}
		}
		
		if(allOdd)
		{
			System.out.println("Array List contains all odd number");
		}
		else
		{
			System.out.println("Array List have NOT all odd number");
		}
	}
}

