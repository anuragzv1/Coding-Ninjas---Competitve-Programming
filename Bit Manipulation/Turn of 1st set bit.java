public class Solution {
	public static int turnOffFirstSetBit(int n) {
		int pos = 0, temp = n;
        while(n!=0){
            if((n&1) == 1)break;
            else pos++;
           	n=n>>1;
        }
        
        return (temp & ~(1<<pos));
         
	}
}
