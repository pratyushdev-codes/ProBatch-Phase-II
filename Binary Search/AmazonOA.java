


// You are given an array of size “N” ; you are given a capacity of “k” ; 
// Each element can be reduced by at most k in 1 move. You are allowed to make maximum “d” moves. Find the minimum possible value of “k” 


public class AmazonOA {
    public static void main(String[] args) {
        
        
    }public static int findMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length; i++){
            if(arr[i]>max){
                max= arr[i];
            }
           
        }
        return max;
    }


    public static  int minimumPossibleValue(int arr []){
        int start = 0;
        int u =0;
        int ans =0;
        int end = findMax(arr);
        while (start <=end ){
            int mid = (start+end)/2;
            if(!check(arr, end, mid)){
                start = mid+1;
            }else{
                if(mid==1){
                    u=1;
                    ans=mid;


                }else{
                    end=mid-1;
                }
            }

        }
        return ans;    
    }
    
    public static boolean check (int arr [], int k , int d){
        int len = arr.length;
        int sum_moves = 0;
        for(int i =0;i<len;i++){
            if(k%d==0){
                 sum_moves= sum_moves+ arr[i]/k;

            }else{
                sum_moves= sum_moves+arr[i]/k+ 1;
            }
        }
          return false;
    }
}
