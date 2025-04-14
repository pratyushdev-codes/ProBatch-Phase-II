import java.util.HashMap;
import java.util.Scanner;

public class t10MicrosoftOA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // size of array b[]
        int[] b = new int[n + 1]; // array b[n+1]
        for (int i = 1; i <= n; i++) {
            b[i] = scanner.nextInt();
        }

        int l = scanner.nextInt();
        int r = scanner.nextInt(); // given limits

        int u = Integer.MAX_VALUE;
        int i = 1, j = 1;
        HashMap<Integer, Integer> k = new HashMap<>();

        while (i <= n && j <= n) {
            //[i.....j]
            if (b[j] >= l && b[j] <= r) {
                k.put(b[j], k.getOrDefault(b[j], 0) + 1);
            }

            if (k.size() == Math.abs(r - l + 1)) {
                //[i.....j] is a valid subarray 
                int length = Math.abs(j - i + 1);
                u = Math.min(length, u);

                if (b[i] >= l && b[i] <= r) {
                    k.put(b[i], k.get(b[i]) - 1);
                    if (k.get(b[i]) == 0) {
                        k.remove(b[i]);
                    }
                }

                i = i + 1; //[i+1]........j]

                if (b[j] >= l && b[j] <= r) {
                    k.put(b[j], k.get(b[j]) - 1); // removing j for temporary basis!
                    if (k.get(b[j]) == 0) {
                        k.remove(b[j]);
                    }
                    //[i+1].....j-1]
                }
            } else {
                j = j + 1;
            }
        }

        if (u == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(u);
        }
    }
}
