public class Solution {
	public static int returnFirstSetBit(int n) {
    	if(n==0)return 0;
        int pos = 0;
        while(n!=0){
            if((n&1) == 1)break;
            else pos++;
           	n=n>>1;
        }
        return (1<<pos);
	}
}
