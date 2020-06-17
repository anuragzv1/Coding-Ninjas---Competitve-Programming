public class Solution {

    public static int mysum(int arr[] , int i){
        if(i==arr.length){
            return 0;
        }
        
        int smallSum = mysum(arr , i+1);
        return arr[i]+smallSum;
    }
    
    
	public static int sum(int input[]) {
		return mysum (input , 0);
	}
}
