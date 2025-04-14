public class SW2AmazonOa {
    public static void main(String[] args) {
        int arr [] = {10 , 4, 8, 13, 20};
        int m =2;

        //To return minimum amount of main memory used by all the proccesses we can remove the maximum Subarray sum of size m
        //we can apply sliding window technique
        int i = 0 ;
        int j = 0;
        int n = arr.length;
        int sum = 0;
        int max =Integer.MIN_VALUE;
        while(j<n){
            sum+= arr[j];

            if(j-i +1<m){
       
                j++;
            }else if(j-i+1==m){
                max = Math.max(max , sum);
                sum-= arr[i];
                i++;
                j++;

            }

        }
        System.out.println(max);
    }
}
