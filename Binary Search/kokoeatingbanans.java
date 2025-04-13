class Solution {
public double totalHours(int piles [], int h){
    double totalHours= 0;
    for(int i =0; i<piles.length; i++){
        totalHours = Math.ceil((double)(piles[i]/ (double)(h)))+ totalHours;
    }
    return totalHours;
  
}public int findMax(int piles[]){
    int max =Integer.MIN_VALUE;

    for(int i =0;i<piles.length;i++){
        max = Math.max(max, piles[i]);
    }
return max ;
}
public int minEatingspeed(int piles [], int h){
    int low = 1; //As  minimum eating speed can be 1
    int high = findMax(piles);
    while (high>=low) {
        int mid = (low + high)/2;

        double TotalHours= totalHours(piles, high);
    if(TotalHours<h){
        high= mid-1;
    }else{
        low = mid+1;
            }
    }
    return low;
    }
    


}






