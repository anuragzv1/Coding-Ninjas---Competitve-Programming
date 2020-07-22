
public class solution {
	public int solve(int n,int A[])
	{
		int dp[] = new int[1001];
        dp[0] = 0;
    
        int freq[] = new int[1001];
        for(int i = 0;i<n;i++){
            freq[A[i]]++;
        }
        
		dp[1] = freq[1];
        
        for(int i = 2;i<=1000;i++){
            dp[i] = Math.max( i*freq[i] + dp[i-2] , dp[i-1]);
        }
    	
        return dp[1000];

	}
}
