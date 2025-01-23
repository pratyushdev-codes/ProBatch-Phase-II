public class dp31BurstBalloon {
    public static void main(String[] args) {
        int nums[] = {3, 1, 5, 8};
        int n= nums.length;
        int dp [][]= new int [n+1][n+1];;
        for(int i = 0 ; i<= n ; ++i){
            for(int j = 0 ; j<= n ; ++j){
                dp[i][j] = -1;
            }
        }


    }public int calculateMaPartition(int nums[] , int dp [][] , int s , int e , int n ){
        if(s>=e){
            return 0;
        }

        if(dp[s][e] !=-1){
            return dp[s][e];    
        }
        int ans =0;
        for(int i = s+1 ; i<e ;i++){
            int startAns= calculateMaPartition(nums, dp, s, i, n); //calculates the left part before the index in 
            int rightAns = calculateMaPartition(nums, dp, i, e, n) //calculates the right part after the index in
            int totalAns = startAns + rightAns + nums[s]*nums[i]*nums[e];
            ans = Math.max(ans , totalAns);
        }
        return ans;
    }
}
