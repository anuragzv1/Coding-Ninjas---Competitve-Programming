
import java.util.*;
public class Solution {
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {

        HashMap<Integer, Boolean> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],false);
            if(!map2.containsKey(arr[i]))map2.put(arr[i], i);
        }
        int start = 0;
        int end = 0;
        int len =-1;

        int local_start = 0, local_end = 0;
        for(int i =0;i<arr.length;i++){
            if(map.get(arr[i]))continue;
            int x = arr[i];
            while(map.containsKey(x)){
                map.put(x , true);
                x--;
            }

            local_start = ++x;

            x = arr[i];
            x++;
            while(map.containsKey(x)){
                map.put(x, true);
                x++;
            }
            local_end = --x;

            if(local_end-local_start+1 >len){
                end = local_end;
                start= local_start;
                len = local_end-local_start+1;
            }
            if(local_end-local_start+1 ==len){
                if(map2.get(start)>map2.get(local_start)){
                    end = local_end;
                    start= local_start;
                    len = local_end-local_start+1;
                }
            }

        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i =start;i<=end;i++){
            list.add(i);
        }
        return list;

    }
}
