package Array;

public class primeCheck {

	public static void main(String args[])
	{
		System.out.println(isprime(78));
		System.out.println(isprime(50));
	}
	
	public static boolean isprime(int n)
	{
		if(n==1 || n==0)
		{
			return false;
		}
		if(n==2)
		{
			return true;
		}
		
		else {
			
			for(int i = 2 ; i <= n/2 ; i++)
			{
				if(n%i==0)
				{
					return false;
				}
			}
		}
		
		return true;
	}
	
	
}
