// Reduce n to 1 
// If the number is even you can divide it by 2. 
// If the number is odd you can do +1 or -1 

import java.util.Arrays;

public class dp11Pt2 {
    public static void main(String[] args) {
        
    }public int transform(int N, int dp[] ){
            
            Arrays.fill(dp ,-1);
            dp[1] = 0;

            for(int i = 2; i<=N ;i++){
                if(i%2==0){
                    dp[i] = dp[i/2]+1;
                }else{
                          dp[i] = Math.min(dp[i-1]+1 , dp[i+1]+1) ;
                }
                return dp[i];
            }
            // The 2 + dp[(i + 1) / 2] accounts for two operations: one to add 1 to i and the second to divide the resulting number by 2.
            // Thus, the 2 + dp[(i + 1) / 2] term reflects the additional steps for converting an odd number into an even number and then dividing it by 2.
         
    }
}
