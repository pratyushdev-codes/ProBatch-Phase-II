//template

public class shortestSubarraySum {
    public static void main(String[] args) {
     int [] arr = {1,0, 0 ,2 ,3 ,5};
     
     int left = 0 ;
     int windowSum = 0;
     int k = 20;
     int minLength = Integer.MAX_VALUE;

     for(int right = 0 ; right< arr.length ; right++){
           windowSum += arr[right];
    
           while(windowSum>=k && left<=right){
             minLength = Math.min(minLength , right-left+1);
             windowSum -= arr[left];
             ++left;
           }

     }
         return minLength;
    }
}
