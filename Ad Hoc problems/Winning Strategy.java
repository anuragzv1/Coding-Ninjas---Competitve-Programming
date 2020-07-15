import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int swaps = 0;
        for(int i =0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                swaps++;
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        
        boolean possible = true;
        for(int i = 0;i<n;i++){
            if(arr[i]!=i+1){
                possible = false;
                break;
            }
        }
        
        if(possible){
            System.out.println("YES");
            System.out.println(swaps);
        }
        else System.out.println("NO");
	}

}
