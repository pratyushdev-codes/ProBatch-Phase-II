public class TwoSumQ1 {

    public static void main(String[] args) {
        
    }public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
    
        while (left < right) {
            int sum = numbers[left] + numbers[right];
    
            if (sum == target) {
                return new int[]{left + 1, right + 1}; // 1-based index as per problem statement
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        throw new IllegalArgumentException("No solution found");
    }
    
}