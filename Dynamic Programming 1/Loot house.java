
public class Solution {
    
//     public static int dp[];
//     public static int getMaxMoneyHelper(int arr[] , int n , int i){
//         if(i >= n){
//             return 0;
//         }
//         if(dp[i]>0)return dp[i];
//         int included = arr[i] + getMaxMoneyHelper(arr , n , i+2);
//         int notIncluded = getMaxMoneyHelper(arr , n , i+1);
        
//         int ans =  Math.max(included , notIncluded);
//         dp[i] = ans;
//         return dp[i];
//     }
    
    
	public static int getMaxMoney(int arr[], int n){
		// dp = new int[n];
		// return getMaxMoneyHelper(arr , n , 0);
        
        int dp[] = new int[n+2];
        int ans = 0;
        for(int i = n-1;i>=0;i--){
            dp[i] = Math.max(arr[i]+dp[i+2] , dp[i+1]);
            ans = Math.max(dp[i], ans);
        }
        return ans;
	}
}
