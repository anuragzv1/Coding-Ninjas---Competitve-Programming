public class Solution {

// 	public static int power(int x, int n) {
// 		if(n==0)return 1;
//         int smallOutput = power(x , n-1);
//         return x * smallOutput;
		
// 	}
    
    // optimized approach
    public static int power(int x, int n) {
        if(n==0)return 1;
        
    	int small = power(x , n/2);
        if(n%2==0){
            return small * small;
        }
        else{
            return small* small * x;
        }
        
    }
    
    
}a
