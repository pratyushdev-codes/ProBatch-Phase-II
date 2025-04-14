import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class bs8amazonOA {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();
            int piles [] = new int [n];
            for(int i : piles){
                piles[i] = sc.nextInt();
            }

            int x = sc.nextInt();  //max limit 
            ArrayList<Integer> list = new ArrayList<>();
            for(int i : piles){
                list.add(piles[i]); //adding all the elements to list
            }

            if(x<piles.length){
                System.out.println(-1);
                return ;
            }

             int limit = Collection.max(list);
             int low = 0;
             int high = limit;
             int ans = 0;
              int flag = 0;
             while(low<=high){
                int mid = low + (high-low)/2;
                if(!countSteps(list , x , mid)){
                    // If check(mid, b, d) is false, increase low to explore larger values of k because the current k is too small.
                    low = mid+1;
                }else{
                    if(mid==1){
                        // The int u variable in your code is being used as a flag to indicate whether the binary search has found a valid k
                        flag = 1;
                        ans = mid;
                    }else {
                        if(mid == 1) {
                            flag = 1;
                            ans = mid;
                        } else if(!countSteps(list, x, mid-1)) {
                            flag = 1;
                            ans = mid;
                        } else {
                            high = mid - 1;
                        }
                    }
                }
        
                System.out.println(ans);
            }
        
        
        }public static boolean countSteps (ArrayList<Integer> list, int x , int k){
            int SumofallBeatingCapacity = 0;
            
            for(int i= 0 ; i< list.size() ; i++){
                if(list.get(i)%k==0){
                    SumofallBeatingCapacity+= list.get(i)/k;
                }else{
                    SumofallBeatingCapacity+= list.get(i)/k+1;
                }
            }
            return SumofallBeatingCapacity<=x ;
        }    

        }
   

