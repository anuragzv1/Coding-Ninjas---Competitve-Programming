import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		//find the minimum & max;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt() , l = sc.nextInt();
        int arr[] = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        	min = Math.min(min , arr[i]);
            max = Math.max(max , arr[i]);
        }
        
        int cost = Integer.MAX_VALUE;
        for(int i = min;i<=max;i++){
            int inc = 0; 
            int dec = 0;
            for(int j = 0;j<n;j++){
                if(arr[j]>i){
                	dec += arr[j]-i;
                }
                else {
                    inc+= i-arr[j];
                }
            }
            
            if(dec<=inc){
                int temp_cost = Math.min(cost , dec*k);
                temp_cost +=(inc-dec)*l;
                cost = Math.min(cost , temp_cost);
                
            }
        }
        System.out.println(cost);
	}

}
