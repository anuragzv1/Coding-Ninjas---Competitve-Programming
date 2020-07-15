public class Solution {
	public static int turnOnIthBit(int n, int i) {
    	return (n | (1<<i));
	}
}
