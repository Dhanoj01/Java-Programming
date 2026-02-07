package javaProgram;

public class Factorial {

	public static long numberFactorial(long n)
	{
		if(n==1)
		{
             return 1;
		}
		
		else
		{
             return (n*numberFactorial(n-1));
		}
	}
	
	public static void main(String args[]) {
		
		System.out.println(numberFactorial(5));
	}
}
