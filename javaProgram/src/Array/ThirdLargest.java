package Array;

import java.util.Arrays;

public class ThirdLargest {

	static int find3rdLargest(int arr[]) {
		
		Arrays.sort(arr);
		
		int n = arr.length;
		
		return arr[n-3];
		
	}
	
	
	
	public static void main(String args[])
	{
		int arr[]= {1,5,4,8,6,7};
		
		System.out.println("Third largest element in array is : " + find3rdLargest(arr));
	}
}
