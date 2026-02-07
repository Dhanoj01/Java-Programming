package Array;

public class TwoSum {

	//find the indices of the two numbers in an array that add up to a target.
	//Brute force approach
	
	public static int[] sumfind(int target , int arr[])
	{
	
		int ans = 0;
		for(int i=0 ; i<arr.length  ; i++)
		{
			for(int j= i+1 ; i< arr.length ; j++)
			{
				if(arr[i]+arr[j]==target)
				{
                  return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1}; 
	}
	
	
	public static void main(String args[])
	{
		int target = 5;
		int arr[] = {2,4,5,6,3};
		
		int[] ans = sumfind(target , arr);
		
		for(int i=0 ; i<ans.length ; i++)
		{
			System.out.println(ans[i] + " ");
		}
		
	}
}
