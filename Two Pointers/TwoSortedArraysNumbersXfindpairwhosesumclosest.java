public class TwoSortedArraysNumbersXfindpairwhosesumclosest {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 7};
        int[] arr2 = {10, 20, 30, 40};
        int x = 32; // Target sum
        int closestSum = XpairsHelper(arr1, arr1.length, arr2.length, arr1, arr2, x);
        System.out.println("Closest sum: " + closestSum);
    }

    public static int XpairsHelper(int[] arr, int m, int n, int[] arr1, int[] arr2, int x) {
        int diff = Integer.MAX_VALUE;
        int res_l = 0;
        int res_r = 0;

        int l = 0, r = n - 1;
        while (l < m && r >= 0) {
            if (Math.abs(arr1[l] + arr2[r] - x) < diff) {
                res_l = l;
                res_r = r;
                diff = Math.abs(arr1[l] + arr2[r] - x);
            }
            if (arr1[l] + arr2[r] > x) {
                r--;
            } else {
                l++;
            }
        }
        return arr1[res_l] + arr2[res_r];
    }
}
