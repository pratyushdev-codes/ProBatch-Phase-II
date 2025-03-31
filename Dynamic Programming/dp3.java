       //using 1-based-indexing.....
       //n-->size of input array
       //a[n+1]-->actual array.
       //dp[n+1]-->our dp1-array
       
       int dp[n+1]={0};
       //dp[1] and dp[2] are calculated by our observation.
       //they can also be called as base-cases.
       dp[1] = max(a[1],0);
       dp[2] = max(a[2],dp[1]);
       //running a loop from i = 3 to i = n 
       int i = 3 ; 
       while(i<=n){
           dp[i] = max ( a[i] + dp[i-2] , dp[i-1] ) ;
           i++;
       }
       
       cout<<dp[n]; 
       //dp[n] is the final answer for the whole array!