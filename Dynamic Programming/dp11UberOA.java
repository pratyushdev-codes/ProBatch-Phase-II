import java.util.Arrays;

public class dp11UberOA {
    public static void main(String[] args) {
        int N = 600;
        int dp [] = new int[N=1];
        Arrays.fill(dp, -1);

        
        int x , y , z = Integer.MAX_VALUE;
        dp[1]=0;
        for(int i =2 ; i<= N ; i++){
            x = dp[i-1]+1;

            if(i%2==0){
                y = dp[i/2]+1;
            }

            if(i%3==0){
                z = dp[i/3]+1;
            }
            dp[i]= Math.min(x, Math.min(y,z));
        }
    
    }
}
