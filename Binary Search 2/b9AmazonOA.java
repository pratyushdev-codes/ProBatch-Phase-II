public class b9AmazonOA {
    public static void main(String[] args) {
        
    }private int firstOccurence(int[] nums, int target) {
        int start = 0 ;
        int end = nums.length-1;
        int firstPos= -1;
    
        while(start<=end){
            int mid = start + (end-start)/2;
    
    
            if(nums[mid]==target){
    
                firstPos =mid;
                end =mid-1;
    
            }else if(nums[mid]>target){
                end= mid-1;
    
            }else{
                start= mid+1;
            }
        }
    return firstPos;
    
    
    }public int findLastOcc(int [] nums , int target){
        int start = 0 ;
        int end = nums.length-1;
        int lastPos= -1;
        while(start<=end){
            int mid = start + (end-start)/2;
    
            if(nums[mid]==target){
                lastPos = mid;
                start = mid+1;
            }else if(nums[mid]< target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return lastPos;
    }public int answer(int arr [] , int k){

        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            int firstOcur= firstOccurence(arr, mid);
            int lastOcur = findLastOcc(arr, mid);


            int d = Math.abs(lastOcur=firstOcur)+1; //beacuse 0 based indexing
            if(d<k){
                return arr[mid];
            }else if( (lastOcur+1)%3 !=0){
                end = firstOcur-1;

            }else{
                start = lastOcur+1;
            }
        }
        return -1;
     
    }
    
    }