public class DuplicateInArray{	

	public static int duplicate(int[] arr){
        int xorOfElements =arr[0];
        for(int i =1;i<arr.length;i++){
            xorOfElements^= arr[i];
        }
        
        int xorOf0ToNMinus2=0;
        for(int i = 1;i<arr.length-1;i++){
            xorOf0ToNMinus2^=i;
        }
        
        return xorOf0ToNMinus2^xorOfElements;
	}
}
