import java.util.*;

// Defining a class named SubarraySumdivisiblebyK
public class SubarraySumdivisiblebyK {
    
    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Main method is empty, no code inside it
    }  

    // Method to find the number of subarrays whose sum is divisible by k
    public int subarraysDivByK(int[] nums, int k) {
        // Creating a HashMap to store remainder-frequency pairs
        HashMap <Integer, Integer> hm = new HashMap<>();
        // Initializing sum to 0
        int sum=0;
        // Initializing count to 0
        int count =0;
        // Putting initial value in the HashMap with key 0 and value 1
        hm.put(0,1);
       
        // Loop through the elements of the array
        for(int i =0;i<nums.length;i++){
            // Adding the current element to the sum
            sum = sum + nums[i];
            // Finding the remainder when sum is divided by k
            int remainder = sum % k;
            // If remainder is negative, adjust it to be positive
            if(remainder < 0){
                remainder = remainder + k;
            }
            // If the HashMap contains the current remainder
            if(hm.containsKey(remainder)){
                // Update count by adding the frequency of the current remainder
                count = count + hm.get(remainder);
                // Increment the frequency of the current remainder in the HashMap
                hm.put(remainder, hm.getOrDefault(remainder, 0) + 1);
            }
        }
        // Return the count of subarrays whose sum is divisible by k
        return count;
    }
}
