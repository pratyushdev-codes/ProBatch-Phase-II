public class dp22GoogleOa {
    public static void main(String[] args) {
        int n = arr.length;
        int dp[][] = new int [n][n+1];
       for(int i [] :dp){
        Arrays.fill(i , -1);
       }
       for(int i =0 ; i<=n ;i++){
        dp[i][0]= arr[i-1]+Math.max(dp[i-1][0], dp[i-1][1]);
        dp[i][1]= -arr[i-1]+ dp[i][0];
       }

    }
}
