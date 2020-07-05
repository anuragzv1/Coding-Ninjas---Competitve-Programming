import java.util.*;

public class Main {
    
    public static boolean check(long n , long k){
        long sumOfSharma = 0;
        long currentRemaining = n;
        while(currentRemaining > 0){
            sumOfSharma+= Math.min(k , currentRemaining);
            currentRemaining -=Math.min(k , currentRemaining);
            currentRemaining -=  currentRemaining/10;
        }
        
        if(2*sumOfSharma >= n)return true;
        else return false;
        
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long low = 1;
        long high = n;
        
        long ans = Integer.MAX_VALUE;
    
        while(low <= high){
            long mid  = (low+high)/2;
        	
            if(check(n , mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(ans);
	}
}
