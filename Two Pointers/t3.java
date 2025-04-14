public class t3 {
    public static void main(String[] args) {
        
    }public int [] squareArray(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = arr.length -1;
        int idx = arr.length-1 ;  //this index will be saving the elements accordingly 
        int ans [] = new int [arr.length];

        while(left<= right){
            int leftSqaure = arr[left]* arr[left];
            int rightSqaure= arr[right]* arr[right];

            if(leftSqaure>rightSqaure){
                ans[idx]= leftSqaure;
                left++;
            }else{
                ans[idx]= rightSqaure;
                right--;
            }
            idx--;
        }
       
        return ans;
    }
}
