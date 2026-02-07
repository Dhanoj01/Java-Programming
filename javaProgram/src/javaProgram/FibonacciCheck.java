package javaProgram;

public class FibonacciCheck {

	public void main(String args[]) {
		
		fiboCheck(8);
	}
	
	public static void fiboCheck(int num)
	{
		int a = 0;
		int b = 1;
		int c = 1;
		
		for(int i=0 ; i<=num ; i++) {
		System.out.println(a + " ");
		
		a = b;
		b = c;
		c= a+b;
	
		}
	}
}
