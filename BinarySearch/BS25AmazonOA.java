public class BS25AmazonOA {

    public static void main(String[] args) {
        int nums [] = {1,3,4,4,5};
        int k = 2;
        int maxAns = Integer.MIN_VALUE;
         
        for(int i = 0 ; i< nums.length ; i++){
            maxAns = Math.max(maxAns,nums[i]);
        }
        int start= maxAns;
        int end = maxAns+k;
        int result = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(canDisttrubute(nums,mid,k)){
                result= mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        System.out.println(result);
    }public static boolean canDisttrubute(int nums [] , int mid , int k){
        int required = 0;
        for(int value:nums){
            required +=(mid-value);
        }
        return required>=k;
    }
}public int findConcecutiveMaxElement(int arr []){
    int q =sc.nextInt();
    
}