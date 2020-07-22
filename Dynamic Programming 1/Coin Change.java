
public class Solution {


    public static int dp[][];
    
    public static int countWaysHelper(int[] deno , int index , int value){
        if(value==0){
            return 1;
        }
        if(value <0 || index>=deno.length)return 0;

        if(dp[value][index]>0)return dp[value][index];
        int ans = 0;
        ans+=countWaysHelper(deno, index+1, value);
        ans+=countWaysHelper(deno , index,value-deno[index]);
        dp[value][index] = ans;
        return ans;
    }


    public static int countWaysToMakeChange(int deno[], int value){
        dp = new int[value+1][deno.length];
        return countWaysHelper(deno , 0, value);
    }

}
