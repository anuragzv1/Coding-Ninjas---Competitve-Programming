import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
            int r = sc.nextInt();
            int c = sc.nextInt();
            int mat[][] = new int[r][c];
            
            for(int i=0;i<r;i++){
                for(int j = 0;j<c;j++){
                    mat[i][j] = sc.nextInt();
                }
            }
            
            int dp[][]= new int[r][c];
            
            dp[r-1][c-1] = 1;
            
            //filling last row
            for(int i = c-2;i>=0;i--){
                dp[r-1][i] = dp[r-1][i+1] - mat[r-1][i];
                if(dp[r-1][i] <=0)dp[r-1][i] = 1;
            }
            
            //filling last column
            for(int j = r-2;j>=0;j--){
                dp[j][c-1] = dp[j+1][c-1] - mat[j][c-1];
                if( dp[j][c-1] <=0) dp[j][c-1] = 1;
            }
            
            for(int i = r-2;i>=0;i--){
                for(int j = c-2;j>=0;j--){
                    dp[i][j] = Math.min(dp[i][j+1], dp[i+1][j]) - mat[i][j];
                    if(dp[i][j] <=0)dp[i][j] = 1;
                }
            }
            
            System.out.println(dp[0][0]);
        }
	}

}
