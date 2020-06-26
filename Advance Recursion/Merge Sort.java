public class solution {

    
    
    public static void  merge(int arr[],int low ,int mid,int high){
        int temp[] = new int[high-low+1];
        int i = low;
        int j = mid+1;
        int k =0;
        while(i<=mid && j <=high){
            if(arr[i]<arr[j]){
                temp[k++] =arr[i++];
            }
            else temp[k++]  = arr[j++];
        }
        
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=high){
            temp[k++] = arr[j++];
        }
        
        k=0;
        for(int x = low;x<=high;x++){
            arr[x] = temp[k++];
        }
        
    }
    
    public static void mergeSort(int arr[], int low , int high){
        if(low<high){
            int mid = (low+high)/2;
            mergeSort(arr , low , mid);
            mergeSort(arr , mid+1 , high);
            merge(arr , low , mid, high);
        }
    }
    
	public static void mergeSort(int[] input){
		mergeSort(input, 0 , input.length-1);
	}
}
