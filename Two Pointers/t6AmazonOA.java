// Given an array B ; find the number of pairs such that b[i] + b[j] <= k 

public class t6AmazonOA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int arr []= new int [n];
       int target = sc.nextInt();
       
       int count = 0 ;
       for(int i = 0 , j = (int)n-1 ; i< n ; i++){
        long curr_sum = arr[i]+ arr[j];

        while(i!=j && curr_sum>target){
            j--;
            curr_sum= arr[i]+ arr[j];
        }if(i==j){
            break;
        }
        count += j-i;


       }
       System.out.println(count);
    }
}
