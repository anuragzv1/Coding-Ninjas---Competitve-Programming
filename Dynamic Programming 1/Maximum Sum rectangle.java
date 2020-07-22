import java.util.Scanner;

public class Main {
    
    //kadanes dynamic programming para
    public static int kadanes(int a[]) 
    { 
        int local_ans =a [0];
        int ans =  a[0];
        
        for(int i = 1;i<a.length;i++){
            local_ans = Math.max(local_ans+a[i] , a[i]);
            ans = Math.max(local_ans , ans);
        }
        return ans;
    } 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat[][] = new int[n][m];
        
        for(int i =0;i<n;i++){
            for(int j = 0;j<m;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int ans = Integer.MIN_VALUE;
        
        
        for(int i =0;i<m;i++){
            int temp_sum [] = new int [mat.length];
            
            for(int k = 0;k<mat.length;k++){
                temp_sum[k] = mat[k][i];
            }
            ans = Math.max(ans , kadanes(temp_sum));
            for(int j =i+1;j<m;j++){
            	for(int k = 0;k<mat.length;k++){
                    temp_sum[k]+=mat[k][j];
                }
                ans = Math.max(kadanes(temp_sum), ans);
            }
        }
		System.out.println(ans);
	}

}
