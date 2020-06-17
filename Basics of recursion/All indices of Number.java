import java.util.ArrayList;
public class Solution {

    public static void allIndexesHelper(int input[] , int x , int i , ArrayList<Integer> list){
        if(i==input.length)return;
        if(input[i]==x)list.add(i);
        allIndexesHelper(input , x , i+1 , list);
    }
    
    
	public static int[] allIndexes(int input[], int x) {
        ArrayList<Integer> list = new ArrayList<Integer>();
		allIndexesHelper(input, x , 0, list);
        int ans[] = new int[list.size()];
        for(int i =0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
	}
	
}
