import java.util.Scanner;

public class dp36GoogleSDE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long maxSum = sc.nextLong();
        long maxPartitions = sc.nextLong();

        long[] values= new long[(int)(n+1)];

        for(int i = 1 ; i<= n ; ++i){
            values[i] = sc.nextLong();
        }

        long[][] dp = new long[105][105];

        for(int i = 0 ; i<105 ; ++i){
            for(int j = 0 ; j<105 ; ++j){
                dp[i][j] = -1;
            }
        }

        dp[0][0]=0;
        dp[1][1] = 1;

        for(int i = 2;i<=n;++i){
            int partitionCount = 0;

            while(partitionCount<=maxPartitions){
                long validWays=0;
                int index=i;
                long currentSum=values[i];

                ss while(index>=1 && currentSum<=maxSum){
                    if(previousWays>0){
                        validWays+=previousWays;
                    }
                    index--;
                    currentSum+=values[index];
                }
              
         
            }

        }
        
    }
}
