// Find the minimum cost to do this  : In one operation ; you must select two adjacent numbers ; and merge them to 1 number ; the cost of doing so is the sum of both numbers ; do this till the array has only 1 number left. Find the min cost to do please. 

import java.util.Scanner;

public class dp29GoogleOA {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
         int arr [] = new int [n];
            for(int i = 0 ; i < n ; ++i){
                arr[i] = sc.nextInt();
            }
            int dp [][] = new int [n+1][n+1];

            for(int i =0; i<= n ; ++i){
                for(int j = 0 ; j <= n ; ++j){
                    dp[i][j] = -1;
                }
            }

            //calculating for 1 length subarray
            for(int i = 0 ; i<=n ;i++){
                dp[i+1][i+1]= arr[i];
            }

            for(int i = 0 ; i<=n-1 ; i++){
                dp[i+1][i+2] = arr[i] + arr[i+1];
            }

            //for all length subarray
           int length=3;
		while(length<=n){
			int i=1;
			int j=i+length-1;
			while(j<=n){
				int k=i;
				int ans=Integer.MAX_VALUE;
				while(k<j){
					int possibilityans=dp[i][k]+dp[k+1][j]+sum(arr,i-1,j-1);
					ans=Math.min(ans,possibilityans);
					k++;
				}
				dp[i][j]=ans;
				i++;
				j++;
			}
			length++;
		}
	  System.out.println(dp[1][n]);	
		
	}public static int Sum(int arr[], int i , int j){
        int sum = 0;
        for(int k = i ; k <= j ; ++k){
            sum+= arr[k];
        }
        return sum;
    }
}
