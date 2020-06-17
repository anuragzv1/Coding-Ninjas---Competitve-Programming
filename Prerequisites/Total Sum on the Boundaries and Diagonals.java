
public class Solution {

	public static void totalSum(int[][] mat) {
		
        int n = mat.length;
        int sum = 0;
        //left diagonal and right diagonal
        for(int i = 1;i<n-1;i++){
            sum+=mat[i][i];
            sum+=mat[i][n-i-1];
        }
        
        //removing the overlapping part
        if(n%2==1)sum-=mat[n/2][n/2];
                
        //top and bottom row
        for(int i = 0;i<n;i++){
            sum+=mat[0][i];
            sum+=mat[n-1][i];
        }
        
        //right and left column
        for(int i =1;i<n-1;i++){
            sum+=mat[i][0];
            sum+=mat[i][n-1];
        }
        
		System.out.println(sum);        
	}

}
