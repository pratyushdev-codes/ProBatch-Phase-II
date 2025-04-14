
//findinf the last and first occurence of a number in a array __> BINARY SEARCH

public class bs1 {

    public static void main(String[] args) {
        
    } public int[] searchRange(int[] nums, int target) {
        int firstP = firstOccurence(nums, target);
        int lastP = findLastOcc(nums, target);
        return new int []{firstP , lastP};

}  private int firstOccurence(int[] nums, int target) {
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
}

}