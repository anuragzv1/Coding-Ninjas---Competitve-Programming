import java.util.*;

public class Solution {
    public static void PairSum(int[] input, int size) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<size;i++){
            int ele = input[i];
            if(map.containsKey(ele)){
                int val= map.get(ele);
                map.put(ele , val+1);
            }
            else map.put(ele ,1);
        }

        for(int i = 0;i<size;i++){
            int ele = input[i];
            if(map.containsKey(-ele)){
                int freq1 = map.get(ele);
                int freq2 = map.get(-ele);
                for(int k=0;k<freq1*freq2;k++){
                    if(ele<0)System.out.println(ele+" "+ (-ele));
                    else System.out.println((-ele)+" "+ele);
                }
                map.remove(ele);
                map.remove(-ele);
            }
        }


    }
}
