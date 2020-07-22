import java.util.Scanner;

public class Main {

    public static int m = (int)Math.pow(10,9)+7;
    
	public static long getAllCodes(int arr[]){
        long dp[] = new long[arr.length+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i =2;i<=arr.length ;i++){
            if(arr[i-1]!=0) dp[i] = dp[i-1];
            if(arr[i-2]*10 + arr[i-1] <=26 && arr[i-2]*10 + arr[i-1]>=10 ){
                dp[i]= (dp[i]%m + dp[i-2]%m)%m;
            }
        }
        return dp[arr.length];
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while(!s.equals("0")){
            int arr [] = new int [s.length()];
            for(int i = 0;i<s.length();i++){
                arr[i] = s.charAt(i) - 48;
            }
            System.out.println(getAllCodes(arr));
            s = sc.nextLine();
        }

	}

}
