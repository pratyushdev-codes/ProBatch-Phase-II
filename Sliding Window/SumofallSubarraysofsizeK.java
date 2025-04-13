public class SumofallSubarraysofsizeK{
    public static void main(String[] args) {
        
    }public static int sumofSubarraywithsuzeK(int arr [], int k){
        int windowSum=0;
        int maxSum=0;

        for(int i =0;i<arr.length;i++){
            windowSum= windowSum+arr[i];

            for(int y=i;y<arr.length;y++){
                windowSum += arr[i] - arr[i-k];
                maxSum= Math.max(maxSum, windowSum);
            }

            }
            return maxSum;
        }
    }
