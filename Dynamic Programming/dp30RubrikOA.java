import java.util.Scanner;

public class dp30RubrikOA {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        int n= s.length();  
        int dp1 [][] = new int [n+1][n+1]; 
        int dp2 [][] = new int [n+1][n+1];     

        for(int i = 0 ; i<= n ; ++i){
            for(int j = 0 ; j<= n ; ++j){
                dp1[i][j] = -1;
                dp2[i][j]= -1;
            }
        }

        /// length 1 String 
        int i = 0;
        while(i<n){
            dp1[i+1][i+1] = 1;
            dp2[i+1][i+1] = 1;
            i++;
        }

        // length 2 String
        while(i<=n-1){
            if(s.charAt(i)==s.charAt(i+1)){
                dp1[i][i+1]=1;
            }

        dp2[i][i+1]=dp2[i][i]+dp2[i+1][i]+dp2[i][i+1];
        i++;
        }

        int length = 3;
        while(length<=n){
             i = 0;
           while(i<n-length+1){
            int j = i+length-1;

            if(s.charAt(i)==s.charAt(j) && dp1[i+1][j-1]==1){
                dp1[i][j]=1;
            }
            i++;
           }

           length++;

        }


    }
}
