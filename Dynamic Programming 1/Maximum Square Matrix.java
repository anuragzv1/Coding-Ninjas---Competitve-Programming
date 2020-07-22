
public class Solution {
	
	public static int findMaxSquareWithAllZeros(int[][] input){
		
        int n = input.length;
        int m = input[0].length;
        int dp[][] = new int [n][m];
        
        if(input[n-1][m-1]==0){
            dp[n-1][m-1]=1;
        }
        
        //filling last row         
        for(int i =m-2;i>=0;i--){
            dp[n-1][i] = (input[n-1][i]==0)? 1:0;
        }
        
        //filling last column
        for(int j =n-2;j>=0;j--){
            dp[j][m-1] = (input[j][m-1]==0)? 1:0;
        }
        
        int ans = 0;
        for(int i = n-2;i>=0;i--){
            for(int j = m-2;j>=0;j--){
                if(input[i][j] == 0){
                    dp[i][j] = Math.min(dp[i+1][j], Math.min(dp[i][j+1],dp[i+1][j+1])) + 1;
                    
                }
            }
        }
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                ans  = Math.max(ans , dp[i][j]);
                // System.out.print(dp[i][j]);
            }
            // System.out.println();
        }
        
        return ans;
        
	}

	
}
