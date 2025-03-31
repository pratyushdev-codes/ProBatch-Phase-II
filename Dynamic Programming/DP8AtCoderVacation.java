import java.util.*;

public class DP8AtCoderVacation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];

        // Input the activities' happiness values
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }

        // DP arrays
        int[] dpA = new int[N];
        int[] dpB = new int[N];
        int[] dpC = new int[N];

        // Base case for day 0
        dpA[0] = A[0];
        dpB[0] = B[0];
        dpC[0] = C[0];

        // Fill the DP arrays for days 1 to N-1
        for (int i = 1; i < N; i++) {
            dpA[i] = A[i] + Math.max(dpB[i - 1], dpC[i - 1]);
            dpB[i] = B[i] + Math.max(dpA[i - 1], dpC[i - 1]);
            dpC[i] = C[i] + Math.max(dpA[i - 1], dpB[i - 1]);
        }

        // Find the maximum happiness on the last day
        int maxHappiness = Math.max(dpA[N - 1], Math.max(dpB[N - 1], dpC[N - 1]));
        System.out.println(maxHappiness);
    }
}
