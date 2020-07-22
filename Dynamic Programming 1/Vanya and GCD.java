import java.util.Scanner;

public class Main {

    public static int gcd(int a , int b){
        if(b==0)return a;
        return gcd(b , a%b);
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //taking array as input
        int arr[]= new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    	//dp array of size n , dp[i] contains numbers with gcd one till i'th index
        int dp[] = new int[n];
        dp[0] = 1;
        
        for(int i =1;i<n;i++){
            dp[i] = 1;
            for(int j = i-1;j>=0;j--){
                if(arr[j]<arr[i] && gcd(arr[i],arr[j])==1){
                   
                }
            }
        }
        System.out.println(dp[n-1]);
	}

}
