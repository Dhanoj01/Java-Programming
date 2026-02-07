package Array;

public class SecondLargest {
	
	
	public int findSecondElement(int arr[])
	{
		
		int largest= arr[0];
		int secondLargest = -1;
		
		for(int i=0 ; i< arr.length ; i++)
		{
		
			if(largest < arr[i])
			{
				secondLargest = largest;
				largest = arr[i];
				
			}
			
			if(largest > arr[i] && secondLargest < arr[i])
			{
				secondLargest = arr[i];
			}
		}
		
		
		return secondLargest;
	}
	
	
	public static void main(String args[]) {
		
		
		SecondLargest obj = new SecondLargest();
		
		int arr[] = {12,12,12};
		int arr2[] = {12,5,12};
		int arr3[] = {12, 35, 1, 10, 34, 1};

		
        System.out.println("Output : "+ obj.findSecondElement(arr));
        System.out.println("Output : "+ obj.findSecondElement(arr2));
        System.out.println("Output : "+ obj.findSecondElement(arr3));

	
		
	}

}






/*
-------------------Problem---------------------


Given an array of positive integers arr[] of size n, the task is to find second largest distinct element in the array.

Note: If the second largest element does not exist, return -1.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.

Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.

Input: arr[] = [10, 10, 10]
Output: -1

*/