public class b05NthRootOfANumber {
    public static void main(String[] args) {
        int A = 81;
        int N = 4;
        System.out.println(findNthRoot(A, N)); // Expected output: 2
    }

    public static int findNthRoot(int A, int N) {
        if (A == 0 || A == 1) return A; // Base cases

        int start = 1;
        int end = A;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Compute mid^N (use long to avoid overflow)
            long midPower = (long) Math.pow(mid, N);

            if (midPower == A) {
                return mid; // Found exact root
            } else if (midPower < A) {
                start = mid + 1; // Root is larger
            } else {
                end = mid - 1; // Root is smaller
            }
        }

        return -1; // If no integer root exists
    }
}
