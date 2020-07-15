public class Solution {
	public static int turnOffIthBit(int n, int i) {
		return(n & ~(1<<i));
	}
}
