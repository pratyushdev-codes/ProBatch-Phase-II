public class numberofSubarraysWithSumK {
    //wrong need to be solved
    public static void main(String[] args) {
        int arr [] = {10, 2, -2, -20, 10};
        int K = -10;

        int j =0;
        int i =0;
        int count =0;
   while(j>arr.length){
    int currSum =0;
    currSum+= arr[j];
    j++;
    if(currSum ==K){
        currSum -=arr[i];
        i++;
    }
   }
   count = j-i+1;
   System.out.println(count);
}

}
