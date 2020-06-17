public class Solution {

    public static boolean checkNumberHelper(int input[], int x, int i) {
        if(i==input.length)return false;
        
        if(input[i]==x)return true;
        else return checkNumberHelper(input , x , i+1);
    }


    public static boolean checkNumber(int input[], int x) {
        return checkNumberHelper(input , x , 0);
    }
}
