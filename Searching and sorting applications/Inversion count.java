
public class solution {
	
    public static long merge(int arr[] , int low , int mid , int high){
        int i = low;
        int j= mid+1;
        int k =0;
        long ans = 0;
        
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[]
            }
        }
    }
    
    public static long inversions(int arr[] , int low , int high){
        long ans=0;
        if(low < high){
            int mid = (low+high)/2;
            ans+=inversions(arr , low, mid);
            ans+=inversions(arr , mid+1 , high);
            ans+=merge(arr, low , mid , high);
        }
        return ans;
    }
    
    
	long solve(int[] A,int n){
        return inversions(A ,0, n-1);
	}
	
}
