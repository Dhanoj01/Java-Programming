package Array;

public class RotateArrayByK {

    public void rotateArray(int arr[], int k) {
        k = k % arr.length;  // handle k > array size

        reverse(arr, 0, arr.length - 1); // Step 1: reverse whole array
        reverse(arr, 0, k - 1);          // Step 2: reverse first k elements
        reverse(arr, k, arr.length - 1); // Step 3: reverse remaining elements
    }

    public void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];   // swap values
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        RotateArrayByK obj = new RotateArrayByK();

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;  // number of rotations

        obj.rotateArray(arr, k);

        System.out.println("Array after rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
