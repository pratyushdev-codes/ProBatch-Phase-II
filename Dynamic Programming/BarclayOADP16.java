import java.util.*;

public class BarclayOADP16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int easy []  = new int [n];
        int hard []  = new int [n];
        for(int i = 0 ; i<= n ; i++){
            easy[i]= sc.nextInt();
            hard[i]= sc.nextInt();
        }

        int dp[][] = new int [n+1][n+1];
        for(int row[][]:dp){
            for(int row2 []: row){
                Arrays.fill(-1, row2);
            }
   
            
        }
        dp[1][1]= easy[1];
        dp[1][2]= hard[1];
        dp[1][3]= 0;
        for(int i = 2; i<= n ; i++){

            dp[i][1]= easy[i]+ Math.max(dp[i-1][2], dp[i-1][3]);
            dp[i][2]= hard[i]+ dp[i-1][3];
            dp[i][3]= 0+ Math.max(dp[i-1][1], dp[i-1][2]);

        }
        System.out.println("Max Possible Val", Math.max(dp[n][1], Math.max(dp[n][2]), dp[n][3]));
    }
}
