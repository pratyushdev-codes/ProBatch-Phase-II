import java.util.HashMap;

public class BSQ31CodewthCisco {
    int static  n ;


    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        // int n = arr.length;
        int m = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>(); 

        for(int i = 0 ; i< m ; i++){   //filling the hashmap, of the machines and their requests
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
    }

    int low = 0 ;
    int high = 2*m;
    int ans = 0;
    while(low<high){
        int mid = low+high/2;
        if(!check(mid , hm)){
            low = mid+1;
        }else{
            HashMap<Integer, Integer> prevHm= new HashMap<>(hm);
            if(!check(mid-1, prevHm)){
                ans = mid;
       
        }else{
            high = mid-1;
        }
    }

}
        

}public static boolean check(int mid , HashMap<Integer, Integer> hm){
  int extra = 0;

  for(int i = 0 ; i<n; i++){
    long t= hm.getOrDefault(i, 0);
    if(t>mid){
        extra += Math.abs(t-mid);
        hm.put(i , mid);
    }
  }
for(int i = 1 ; i <=n ; i++){
    int t = hm.getOrDefault(i , 0);
    int put = (mid-t)/2;    
    extra -=put;


}
return extra<=0;
}

}



    // }public static int  frequence(int nums[]){
    //     HashMap<Integer , Integer> hm = new HashMap<>();
    //     int n= nums.length;
    //     for(int i=0 ;i<n;i++){
    //         if(!hm.containsKey(nums[i])){
    //             hm.put(nums[i], hm.getOrDefault(i, 0)+1);
              
    //         }else{
    //             hm.put(nums[i],1);
    //         }
    //     }
    // }