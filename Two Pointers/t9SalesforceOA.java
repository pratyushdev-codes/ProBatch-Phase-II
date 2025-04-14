
// Part 1 Questions - Given Array A and Array B :- Find out if array B is a subsequence of array A. 

// Array A = [1 2 5 8 8 6 5 4 3] 

// Array B = [5 5]

// O/P - True;



// Part 2 - Question :- Saledsforce OA _ Given two array A and B :- Find the number of good indices in array B 

// Good Index meaning - When you remove this index :- array B becomes a subsequence of array A


import java.util.*;
public class t9SalesforceOA {
    public static void main(String[] args) {
     int A [] = {1, 2, 5, 8, 8, 6, 5, 4, 3};
     int B [] = {5,5};

 
    }public boolean checkisSubsequence(int arr1[], int arr2[]){
        int i = 0;
        int j = 0;
        int count = 0;
        while(i< arr1.length && j<arr2.length){
            if(arr1[i]==arr2[i]){
              count++;
              i++;
              j++;
            }else{
                j++;
            }
            
        }if(count == arr2.length){
            return true;
        }
        return false;
    }public int countGoodIndices(int arr1[] , int arr2 []){

        for(int i = 0 ; i< arr1.length ; i++){
            if()
        }
    }
}
