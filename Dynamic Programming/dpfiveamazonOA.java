public class dpfiveamazonOA {

    public static void main(String[] args) {
        //main fn
    }public int findMinCost(int cost [] , int n , int dp[]){


        dp[1]=0;
        dp[2]= Math.abs(cost[1]- cost[2]);
      

         for(int i = 3; i<= cost.length  ; i++){
            int y = Math.abs(cost[i]-cost[i-1]+ dp[i-1]);

            int y2= Math.abs(cost[i]- cost[i-3]+ dp[i-3]);
            dp[n]= Math.min(y, y2);
         }

      

         return dp[n];

    }
}