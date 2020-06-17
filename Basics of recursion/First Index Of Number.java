
public class Solution {

    public static int firstIndexHelper(int input[], int x, int i) {
        if(i==input.length)return -1;
        
        if(input[i]==x)return i;
        else return firstIndexHelper(input , x, i+1);
    }
    
	public static int firstIndex(int input[], int x) {
        return firstIndexHelper(input , x , 0);
	}
	
}
