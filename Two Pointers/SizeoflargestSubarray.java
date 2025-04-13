/**
 * SizeoflargestSubarray
 */
public class SizeoflargestSubarray {

    public static void main(String[] args) {
        
    }public static int LargestSubarray(int arr [], int n , int k ){
        int i =0;
        int j=0;
        int res =0;
        long sum=0;

        while(i<n){
            while(j<n && sum<=k){
                sum = sum + arr[j];
                j++;

            }res = Math.max(res, j-i);
            sum = sum - arr[i];
            i++;
        }return res;

        }
    }
