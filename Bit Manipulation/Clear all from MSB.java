public class Solution {

	public static int clearAllBits(int n, int i) {
        int mask = 1<<i;
        mask--;
        return (n & mask);
	}
}
