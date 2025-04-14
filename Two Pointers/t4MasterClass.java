import java.util.Scanner;


public class t4MasterClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[]arr = new long[n];
        
        for (int i = 0; i < n; i++) {
           arr[i] = sc.nextLong();
        }
        
        long count = 0;
        long sum = 0;
        for (int i = 0, j = 0; j < n; j++) {
            sum +=arr[j];
            while (sum > k) {
                sum -=arr[i];
                i++;
            }
            count += (j - i + 1);
        }
        
        System.out.println(count);
        sc.close();
    }
}
