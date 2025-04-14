
// https://www.codechef.com/problems/APPENDOR?tab=statement

import java.util.Scanner;

public class BT1AppendforOR {

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                int a[] = new int[n];
                int temp = a[0];
                for(int i=0;i<n;i++){
                    a[i] = sc.nextInt();
                }
                int Y = sc.nextInt();

                for(int i =0 ; i<a.length; i++){
                    temp = temp | a[i];
                }
                int ans = 0;
                for(int k = 0 ; k<Y ; k++){
                    if( (temp | k )== Y){
                       ans = k;
                           break;
                    }       
               }
               System.out.println(ans);
            }
        }

}