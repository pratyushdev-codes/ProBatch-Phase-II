import java.util.*;
public class maximumSumSubarrayofSizeK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the elements of the array: ");
        for (int x = 0; x < n; x++) {
            arr[x] = sc.nextInt();
        }
        
        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();

        // Initialize pointers and variables
        int i = 0, j = 0, sum = 0, max = Integer.MIN_VALUE;

        // Sliding window logic
        while (j < n) {
            sum += arr[j];

            if (j - i + 1 < k) {
                // Increase the window size
                j++; 
            } else if (j - i + 1 == k) {
                // Calculate max for the window of size k
                max = Math.max(max, sum);
                
                // Slide the window
                sum -= arr[i];
                i++;
                j++;
            }
        }

        System.out.println("Maximum sum of subarray of size " + k + " is: " + max);
    }
}
