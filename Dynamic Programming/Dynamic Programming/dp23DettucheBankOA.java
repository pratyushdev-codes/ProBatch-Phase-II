public class dp23DettucheBankOA {

    public int maximizeProfit(int easy [] , int medium [ ] ,   int hard [] , int dp[][], int n){

        // 2D DP --> index and task

           // starting first few index - No rule.

           int easy_dp[]= new int [n+1];
           int medium_dp[]= new int [n+1];
           int hard_dp[]= new int [n+1];

           easy_dp[0] = easy[0];
           medium_dp[0]= medium[0];
           hard_dp[0] = hard[0];


           easy_dp[1] = easy[1] + Math.max(easy[1], medium[1] , hard[1]);
           medium_dp[1]= medium[1]+ Math.max(easy[1], medium[1] , hard[1]);
           hard_dp[1] = hard[1]+Math.max(easy[1], medium[1] , hard[1]);


           easy_dp[2] = easy[2] + Math.max(easy_dp[2], medium_dp[2] , hard_dp[2]);
           medium_dp[2]= medium[2] + easy_dp[1]+ medium_dp[0];
           hard_dp[2] = hard[2] + easy[1]+ Math.max(hard_dp[2] , easy_dp[2] , medium_dp[2]);

           for(int i = 3 ; i<= n ; ++i){

            easy_dp[i]= easy[i] + Math.max(easy_dp[i-1] ,medium_dp[i-1] , hard[i-1] );

            medium_dp[i] = medium[i] + easy[i-1] + medium_dp[i-2];

            hard_dp[i] = Math.max(hard_dp[i], hard[i]+medium[i-1]+easy[i-2]+medium_dp[i-3]);

            hard_dp[i]= Math.max(hard_dp[i] ,hard[i] + hard[i - 1] + easy[i - 2] + easy_dp[i - 3]);

           }

           return Math.max(easy_dp[n], Math.max(medium_dp[n] , hard_dp[n]));



        

    }
    
    
}public static void   main(String Args[]){

    int easy [] = new int[n];
    int medium [ ] = new int [n];
    int hard []= new int [n];

        

}
