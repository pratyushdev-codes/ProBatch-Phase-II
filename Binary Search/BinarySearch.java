public class BinarySearch{
    public static void main(String[] args) {
        
    }public static int binarySearch(int arr[], int target){
        int start =0;
        int end = arr.length-1; 
        int mid = (start + end)/2;
       while(start <=end ){
        if(arr[mid]==target){
            return mid;
        }if(arr[mid]<target){
            start = mid+1;
        }else{
            end= mid -1;

    }
    return -1;
}
    }
}