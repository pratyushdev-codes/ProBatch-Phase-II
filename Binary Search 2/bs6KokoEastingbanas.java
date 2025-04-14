public class bs6KokoEastingbanas {
    public static void main(String[] args) {
        
    }public int kokoEatingBananas(int [] arr , int h){

    }public static int calculateHours(int [] arr , int h){
        double totalHours = 0;
        for(int i = 0 ; i < arr.length ; i++){
            totalHours+=Math.ceil((int)arr[i]/(int)h);
        }
        return (int)totalHours;
    }public int findMax(int arr []){
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            max =Math.max(max , arr[i]);
        }
        return max;
    }public int findMin(int arr[] , int h){
        int low = 0;
        int high = findMax(arr);

        while(low<=high){
            int mid = low + (high-low)/2;
            int totalHourss= totalHours(arr , h);

            if(totalHourss<= h){
              high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}
