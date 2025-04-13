// // Find whether an array is subset of another array
// Given two arrays: arr1[0..m-1] and arr2[0..n-1]. Find whether arr2[] is a subset of arr1[] or not. Both arrays are not in sorted order. It may be assumed that elements in both arrays are distinct.

public class IsSubsetofanotherarray{
  public static void main(String [] args){
    int arr1[] = { 11, 1, 13, 21, 3, 7 };
    int arr2[] = { 11, 3, 7, 1 };
    int m=arr1.length;
    int n=arr2.length;

  }public static boolean isSubset(int arr1[], int arr2[], int m, int n){
    
   for(int i =0;i<n; i++){
    for(int j=0;j<m;j++){
        if(arr[m]==arr[n]){
            break;

        }if(j==m){
            return false;
        }
        return true;
    }
   }
  }

}