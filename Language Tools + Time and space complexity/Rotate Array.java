
public class Solution {  

    public static void  myrotate (int arr[], int start , int end){
        while(start <end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[] arr, int d) {
        myrotate(arr , 0 , d-1);
        myrotate(arr ,d , arr.length-1);
        myrotate(arr , 0 , arr.length-1);
    }

}
