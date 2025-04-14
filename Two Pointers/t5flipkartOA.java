import java.util.HashMap;
import java.util.Scanner;

public class t5flipkartOA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] b = new int[n];
        for (int i = 0; i < n; ++i) {
            b[i] = scanner.nextInt();
        }

        int v = 0;
        int i = 0, j = 0;
        HashMap<Integer, Integer> k = new HashMap<>();

        while (i < n && j < n) {
            if (!k.containsKey(b[j])) {
                k.put(b[j], j);
                int l = j - i + 1;
                v = Math.max(v, l);
                j++;
            } else {
                //it is occuring once again and hence we are starting again using the ith pointer
                int id = k.get(b[j]);
                while (i <= id) {
                    k.remove(b[i]);
                    i++;
                }
                i = id + 1;
                k.put(b[j], j);
                j++;
            }
        }

        System.out.println(v);
    }
}
