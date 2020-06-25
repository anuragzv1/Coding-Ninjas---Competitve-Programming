import java.util.Scanner;

public class Main {


    public static long merge(int arr [], int low , int mid , int high){
        int temp [] = new int[high-low+1];
        int i =low;
        int j = mid+1;
        int k =0;
        long ans =0;
        while(i<=mid && j <=high){
            if(arr[i]<=arr[j]){
                if(arr[i]!=arr[j]) ans+=arr[i]*(high-j+1);
                 else{
                    int x = j;
                    long ele = arr[j];
                    while(arr[x+1]==ele && x<=high)x++;
                    ans+=(high-x)*arr[i] ;
                }
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] =arr[j++];
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=high){
            temp[k++] = arr[j++];
        }

        k=0;
        for(int z =low;z<=high;z++){
            arr[z] = temp[k++];
        }

        return ans;
    }


    public static long getSum(int arr[] , int low , int high){
        long ans = 0;
        if(low<high){
            int mid = (low+high)/2;
            ans+=getSum(arr , low ,mid);
            ans+=getSum(arr , mid+1 , high);
            ans+=merge(arr , low , mid , high);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc=0;tc<t;tc++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            long ans = getSum(arr , 0 , n-1);
            System.out.println(ans);
        }
    }
}
