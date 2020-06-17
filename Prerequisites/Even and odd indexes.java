import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
		int evenSum = 0, oddSum =0;
        for(int i =0;i<n;i++){
            if(arr[i]%2==0 && i%2==0)evenSum+=arr[i];
            if(arr[i]%2==1 && i%2==1)oddSum+=arr[i];
        }
        System.out.print(evenSum+" "+oddSum);
	}
}
