
// Q1. Find the middle occurrence of X in the given array
// A = [1,2,2,2,2,3,4,5,6,7] , X= 2
// Output : 2

public class middleoccurenceofXinarray {
    public static void main(String[] args) {

    }

    public static int middleoccurencofXinArray(int arr[], int x) {
        int firstocc = -1;

        int start = 0;
        int end = arr.length - 1;

        while (end >= start) {
            int mid = start + end / 2;

            if (arr[mid] == x) {
                firstocc = mid;
                end = mid - 1;// Check for more first occurences  on left side

            } else if (arr[mid] < x) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        if (firstocc == -1) {
            return -1;
        }
        start = firstocc;

        while (start <= end) {
            int mid = start + end / 2;
            if (arr[mid] == x) {
                firstocc = mid;
                start = mid + 1;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return firstocc;

    }
}
