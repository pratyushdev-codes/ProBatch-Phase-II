public class findfirstoccurenceof1 {
    public static void main(String[] args) {
        
    }public static int printfirstoccurenceofOne(int arr []){
      int start =0;
      int end = arr.length-1;
      int ans =0;
      while (end>=start) {
        int mid = (start+end)/2;
        if(arr[mid]<=0){
            start= end+1;
        }else if(arr[mid -1]==1){
            end = mid-1;
        }else{
            ans= mid;
            break;
        }
        
      }
      return ans;
    }
}
