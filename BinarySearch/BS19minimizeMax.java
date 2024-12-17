import java.util.*;
public class BS19minimizeMax {
    public static void main(String[] args) {
        
    }public static boolean canformPairs(int arr [] , int DiffLimit , int K){
        int count =1 ;
        int maxDifference = 0;
        for(int i =0 ; i<arr.length ; i++){
            if(maxDifference>K){
                return false;
            }

            if( Math.abs(arr[i]-arr[i+1])<=DiffLimit){
                i++;
               count++;
            }
        }
        return count>=K;

    }public static int formPair(int arr [], int K){
        Arrays.sort(arr);
        int ans = 0;

        // we have to minimize
        int n = arr.length;
        int start = 0;
        int end = arr[n-1]; //max ele

        while(start<=end){
            int mid  = start+end/2;

            if(canformPairs(arr, mid , K)){
                ans= mid;
                end = mid-1;
            }else{
                start=mid+1;
            }
        }

return ans;

    }
}
