public class t2 {
    public static void main(String[] args) {
        
    } public void findMaxArray(int [] arr1, int [] arr2, int target){
        int i = 0; //this iterator will iterate on Arr 1
        int first = 0;
        int second = 0;
        int j = arr2.length; // this iterator will iterate on Arr 2
         int ans = 0 ;
        while( i<= arr1.length && j>= 1){

            if(arr1[i]+ arr2[j]<=target){
                int sum = arr1[i]+ arr2[j];
                if(sum>ans){
                    ans = sum;
                    first = arr1[i];
                    second = arr2[j];
            }
            i=i+1;
        }else{
            j = j-1;
        }
    }
    System.out.println(ans);
}
}
