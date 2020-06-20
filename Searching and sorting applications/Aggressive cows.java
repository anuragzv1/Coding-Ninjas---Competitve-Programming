import java.util.Scanner;
import java.util.Arrays;
public class Main {


    public static boolean isPossible(int arr[] , int mid,int cows){

        int last = arr[0];
        int count=1;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]-last >=mid){
                count++;
                last = arr[i];
            }
            if(count==cows)return true;
        }
        return false;
    }


    public static int getMaxDistance(int arr[],int cows){
        if(arr.length == 0)return 0;
        Arrays.sort(arr);

        int low = arr[0];
        int high = arr[arr.length-1];

        int ans=0;
        while(low<=high){
            int mid = (high+low)/2;
            if(isPossible(arr,mid,cows)){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc=0;tc<t;tc++){
            int n = sc.nextInt();
            int c = sc.nextInt();
            int arr [] = new int[n];
            for(int i =0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            System.out.println(getMaxDistance(arr ,c));
        }

    }

}
