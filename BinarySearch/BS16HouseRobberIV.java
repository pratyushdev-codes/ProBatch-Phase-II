package BinarySearch;

public class BS16HouseRobberIV {

    public static void main(String[] args) {
        
    }public boolean check(int nums [], int mid , int k ){
        int total = 0;
        for(int i =0 ; i< nums.length ; i++){
            if(nums[i]<=mid){
                i++;
                total++;
            }
           
        }
        return (total>=k);

    }public int findMin(int nums [],int k){
        int start = 0 ;
        int end = 10005;
        int ans = 10005;

        while(start<=end){
            int mid = (start+end)/2;

            if(check(nums, mid, k)){
                //we can find better ans
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
      return ans;


    }
}