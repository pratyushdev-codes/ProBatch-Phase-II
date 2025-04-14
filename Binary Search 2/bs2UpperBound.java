// -> Given a sorted array of size “N”; find the index of the number in the array which is just greater than x and as close as possible to x.

// -> Upper Bound (x) = Returns index of the number which is just greater than x and as close as possible to x.

public class bs2UpperBound {

    public static void main(String[] args) {
        
    }public static int findUpperBoound(int arr [] , int number){
        int start = 0 ;
        int end = arr.length-1;
        int ans ;
        while(start<=end){
            int mid = start+ (end-start)/2;
          if(arr[mid]<=number){
                start= mid+1;
            }else{
                end = mid;
            }
        }
        return start;

    }
}