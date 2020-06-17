
public class Solution {

    
    public static int lastIndexHelper(int input[], int x, int i) {
        if(i==-1){
            return -1;
        }
        
        if(input[i]==x)return i;
        else return lastIndexHelper(input , x , i-1);
    }
    
	public static int lastIndex(int input[], int x) {
		return lastIndexHelper(input , x , input.length-1);
	}
	
}
