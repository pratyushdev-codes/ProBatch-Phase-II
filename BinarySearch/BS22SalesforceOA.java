/*package whatever //do not write package name here */

import java.io.*;

import java.util.Scanner;

class BS22SalesforceOA {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long m = scanner.nextLong();
            long[] b = new long[100005];
            long sum = 0;
            long mx = Long.MIN_VALUE;

            for (int i = 1; i <= m; i++) {
                b[i] = scanner.nextLong();
                mx = Math.max(mx, b[i]);
                sum += b[i];
            }

            long low = mx;
            long high = sum;
            long k = 0;
            long v = -1;

            while (low <= high && k == 0) {
                long mid = (low + high) / 2;
                if (mid == mx && check(b, n, m, mx + 1) && check(b, n, m, mx)) {
                    v = mid;
             
                } else if (!check(b, n, m, mid) && !check(b, n, m, mid + 1)) {
                    low = mid + 1;
                } else if (check(b, n, m, mid) && !check(b, n, m, mid - 1)) {
                    v = mid;
            
                } else if (!check(b, n, m, mid) && check(b, n, m, mid + 1)) {
                    v = mid + 1;

                } else if (check(b, n, m, mid) && check(b, n, m, mid - 1)) {
                    high = mid - 1;
                }
            }

            System.out.println(v);
        }
    }

    public static boolean check(long[] b, long n, long m, long vl) {
        int i = 1;
        long c = 0;
        long sum = 0;
        while (i <= m) {
            sum += b[i];
            if (sum <= vl) {
                i++;
            } else {
                c++;
                sum = 0;
            }
        }
        if (c + 1 <= n) {
            return true;
        }
        return false;
    }
}
