import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int [n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(getMaxCandies(arr,k));
        }
    }

    public static int getMaxCandies(int arr [] ,int k){
        Arrays.sort(arr);

        int low = 1;
        int high = arr[arr.length-1];
        int ans = 1;
        while(low<=high){
            int mid = (low+high)/2;
            if(canDistribute(arr, mid, k)){
                ans =mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }

    public static boolean canDistribute(int arr[] , int mid , int k){
		
        int count = 0;
        for(int i  = 0;i<arr.length;i++){
            count += (arr[i]/mid);
            if(count >=k)return true;
        }
        return false;
    }

}
