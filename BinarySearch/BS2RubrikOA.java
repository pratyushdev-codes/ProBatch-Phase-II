import java.util.Scanner;

public class BS2RubrikOA {
    public static void main(String[] args) {
        // Applying BS to find first F F F F F F F T T T 
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){

            int n = sc.nextInt();
            int low = 1;
            int high = n;
            int k = 0;
            int answer = 0;
 
            while (low <= high && k == 0) {
                int mid = (low + high) / 2;
 
                if(maxChocolates(mid)==n){
            	answer = mid ; 
            }
 
                if (maxChocolates(mid) > n) {
                    if (maxChocolates(mid - 1) > n) {
                        high = mid - 1;
                    } else {
                        k = 1;
 
                        if (maxChocolates(mid - 1) == n) {
                            answer = mid - 1;
                        } else {
                            answer = mid;
                        }
                    }
                } else {
                    // mid ---> T
                    low = mid + 1;
                }
            }
 
            System.out.println(answer);
        }
    }public static int  findMaxChocolate (int G){

        int max = 0;

        if(G%2==0){
            max = (G/2)*(G/2+1); //it is even 
        }else{
         int slope1 = G/2+1;
         int slope2 = G/2;
         int G1 = slope1/2 +1;
         int G2 = slope2/2 +1;

         max = G1+G2;
        }
    }
}
