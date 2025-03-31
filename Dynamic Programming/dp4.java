/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

class dp4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n + 1]; // using 1-based indexing
        int i = 1;
        while (i <= n) {
            a[i] = scanner.nextInt();
            i++;
        }

        // Calculate subset with maximum sum such that no two elements are adjacent
        // Step 1: declare a dp array
        int[] dp = new int[n + 1];
        int l = 0;
        dp[1] = Math.max(a[1], l);
        dp[2] = Math.max(a[1], Math.max(a[2], l));
        // we calculate the formula dp[i] = max(dp[i-1], a[i] + dp[i-2])
        i = 3;
        while (i <= n) {
            dp[i]=Math.max( Math.max(a1[i],a2[i])+dp[i-2],dp[i-1]);
            i++;
        }

        System.out.println(dp[n]);
    }

}