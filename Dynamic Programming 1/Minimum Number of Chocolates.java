
public class Solution {

    public static int getMin(int arr[], int N){

        int dp[] = new int [N];
        dp[0] = 1;
        for(int i = 1;i<N;i++){
            if(arr[i]>arr[i-1]){
                dp[i] = dp[i-1]+1;
            }
            else{
                dp[i] = 1;
            }
        }

        for(int i=N-1;i>=1;i--){
            if(arr[i]<arr[i-1]){
                dp[i-1] = Math.max(dp[i-1] , dp[i]+1);
            }
        }
       
        int ans = 0;
        for(int i = 0;i<N;i++){
            ans +=dp[i];
        }
        return ans;
    }
}
