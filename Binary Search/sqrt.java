public class sqrt {
    public static void main(String[] args) {
        
    }public static int  squareRoot(int x){ 
        if(x==0||x==1){
            return x;
        }int start = 1;
        int end =0;
        int mid = -1;
        while(start<=end){
            mid= (start-end)+end/2;
            if((long)mid*mid ==(long) x){
                return mid;
        
    }else{
        if((long)mid*mid<(long)x){
             start= mid+1;
        }else{
            end = mid-1;
        }

    }
  
    
}
return -1;
    }

}