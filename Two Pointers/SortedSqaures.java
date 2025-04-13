import java.util.Scanner;

public class SortedSqaures {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int arr [] = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(squaresSortedArray(arr));
    }public static int[] squaresSortedArray(int arr []){
        
        int n = arr.length;
        int left = 0;
        int  right=n-1;
        int result []= new int [n];
        int index =n-1;
         while(left<right){
            int leftSquare = arr[left]*arr[left];
            int rightSqaure = arr[right]*arr[right];

            if(leftSquare > rightSqaure ){
                 result[index]=leftSquare;
                 left++;
            }else{

                result[index] = rightSqaure;
                right--;
            }
            index -- ;
         }

         return result;
        }
      
        
     
    }
    
