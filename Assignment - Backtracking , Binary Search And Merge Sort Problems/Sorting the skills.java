import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int arr[] = new int [n];
            for(int i =0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            boolean flag = false;
            for(int i = 0;i<arr.length-2;i++){
                if(arr[i]-arr[i+2]>1){
					System.out.println("No");
                    flag = true;
                    break;
                }
            }
            if(flag == false)System.out.println("Yes");
        }

    }
}
