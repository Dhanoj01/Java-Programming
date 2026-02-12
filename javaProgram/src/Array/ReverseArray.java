package Array;

public class ReverseArray {
	
	static void swapMethod(int[] arr)
	{
		int n = arr.length;
		int low = 0;
		int high = n-1;
		while(low <= high)
		{
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			
			low++;
			high--;
		}
		
	}
	
	
	public static void main(String args[])
	{
		
		int arr[]= {5,4,3,2,1};
	
		
		System.out.println("------Array Before reverse------");
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		//calling the swap method
		swapMethod(arr);
		System.out.println();
		
       System.out.println("------Array After reverse------");
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
