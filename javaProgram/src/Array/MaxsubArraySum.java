package Array;

public class MaxsubArraySum {

	public int kadensAlgorithm(int nums[])
	{
		int currSum = nums[0];
		int maxSum = nums[0];
		
		
		for(int i=0 ; i<nums.length ; i++)
		{
			
			currSum = Math.max(currSum , nums[i]);
			maxSum = Math.max(maxSum, currSum);
		}
		
		return maxSum;
	}
	
	public static void main(String args[])
	{
		
		MaxsubArraySum obj = new MaxsubArraySum();
		
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

		int ans = obj.kadensAlgorithm(nums);
		
		System.out.println("Maximum SubArray sum is = " + ans);
	}
}
