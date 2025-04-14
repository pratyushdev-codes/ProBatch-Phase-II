import java.util.HashMap;
import java.util.Scanner;

public class h20MicrosoftOA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        // Using a traditional for loop to input values into the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        long result = CountequalsDigitSum(arr, n);
        System.out.println(result);
    }

    public static long CountequalsDigitSum(int[] arr, int N) {
        HashMap<Long, Long> hm = new HashMap<>();
        long ans = -1;

        for (int i = 0; i < arr.length; i++) {
            long digitSum = findDigitSum(arr[i]);

            // Check if the digit sum already exists in the map
            if (hm.containsKey(digitSum)) {
                long currAns = arr[i] + hm.get(digitSum);
                ans = Math.max(ans, currAns);
            }

            // Store the maximum value associated with this digit sum
            hm.put(digitSum, Math.max(hm.getOrDefault(digitSum, Long.MIN_VALUE), (long) arr[i]));
        }

        return ans;
    }

    public static long findDigitSum(int num) {
        long sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
