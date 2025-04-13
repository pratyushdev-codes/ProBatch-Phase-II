/**
 * UpperBoundX
 */
public class UpperBoundX {

    public static void main(String[] args) {
        
    }public static int upperBound(int arr [], int target){
        
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]<=target){
                 start = mid+1;



        }else{
            end= mid;
        }
    }
    return end;
}
}