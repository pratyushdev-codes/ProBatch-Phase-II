public class palindromicSubstring {
    public int countSubstring(String s){
        int n = s.length();
        boolean dp [][] = new int boolean [n+1][n+1];
        int count = 0 ;


        for(int i = 0 ; i< n ;i++){
            for(int j = 1; j<n ; j++){
                if(checkPalindrome(s , i , j , dp));
            }
        }

    }public boolean checkPalindrome(String s, int i , int j , int dp[][]){
        if(i>j) return true;

        if(i==j) return true;

        if(dp[i][j]) return true;

        if(s.charAt(i)==s.charAt(j)){
            if(i+1 >j-1 || checkPalindrome(s , i +1 ,j-1 , dp));
            dp[i][j] = true;
            return true;

        }
        dp[i][j] = false;
        return false;

    }
}
