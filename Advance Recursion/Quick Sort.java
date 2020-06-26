
public class Solution {


    public static int findPivot(int arr[] ,int low , int high){
        int x = arr[high];
        int numSmallEqual = 0;
        for(int i = low;i<high;i++){
			if(arr[i]<=x)numSmallEqual++;
        }
        int temp = arr[low+numSmallEqual];
        arr[low+numSmallEqual] = x;
        arr[high]  = temp;
        
        int i = low;
        int j = high;
        while(i<low+numSmallEqual && j >low+numSmallEqual){
            if(arr[i]>x && arr[j] <=x){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            else if(arr[i]<=x)i++;
            else j--;
        }
        
        return low+numSmallEqual;
    
    }


    public static void quickSortHelper(int input[], int low , int high){
        if(low<high){
            int pivot = findPivot(input , low, high);
            quickSortHelper(input , low , pivot-1);
            quickSortHelper(input , pivot+1 , high);
        }

    }

    public static void quickSort(int[] input) {
        quickSortHelper(input , 0 , input.length-1);
    }

}
