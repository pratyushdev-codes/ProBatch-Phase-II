public class FirstandLastposition {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        int first = firstPosition(nums, target);
        int last = lastPosition(nums, target);
        return new int[] { first, last };

    }

    private int firstPosition(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int first = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                first = mid;
                end = mid - 1;

            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return first;
    }

    private int lastPosition(int[] nums, int target) {
        int start = 0;
        int end = 0;
        int last = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                last = mid;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }

        }
        return last;
    }
}