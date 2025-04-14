import java.util.*;

public class t6AmazonOAPt2 {
    static long n;
    static long[] b = new long[100000];

    static long calculate(long k) {
        long count = 0;
        for (int i = 0, j = (int) (n - 1); i < n; i++) {
            long d = b[j] + b[i]; //[i............j]
            while (d > k && i != j) {
                j--;
                d = b[j] + b[i];
            }
            if (i == j) {
                break;
            }
            count += (j - i);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextLong();
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextLong();
        }

        long l, r;
        l = scanner.nextLong();
        r = scanner.nextLong();
        Arrays.sort(b, 0, (int) n);
        System.out.println(calculate(r) - calculate(l - 1));
    }
}
