public class bs6MASTERCLASS {
    public static void main(String[] args) {
        
    }public int findOcc(int arr [] ){
        int start = 0;
        int end = arr.length-1;
       int idx = -1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]==0){
                start = mid+1;
            }else if(arr[mid-1]==1){
                end = mid-1;
            }else{
                idx =mid;
                break;
            }
        }
        return idx;
    }

}
