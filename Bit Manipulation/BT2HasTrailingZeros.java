// Understanding ->  You are given an array of size “N”; all positive numbers in it can select >=2 elements from the array such that their Bitwise OR has trailing zeroes in the end. 

// Observation:-> If the number is even; last digit of the binary representation will be 0 else 1 

// -> If you pick any 2 even numbers from the array their  bitwise OR will have 0 in the last digit for sure.


public class BT2HasTrailingZeros {
    public static void main(String[] args) {
        int arr [] = new int []; // array given in LC Q
        for(int i =0 ; i<n ; i++){
            for(int j = 0 ; j< n ; j++){
                if(i!=j && (arr[i] | arr[j])%2==0){

                    // even hai--> trailing zeroes
                    System.out.println("TRUE");
                }else{
                        System.out.println("FALSE");
                }
            }
        }
    }
}
