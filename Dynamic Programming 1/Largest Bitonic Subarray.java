import java.util.Scanner;
public class Solution {
    public static int longestBitonicSubarray(int[] input){
        int n = input.length;
        int inc[] = new int[n];
        int dec[] = new int [n];

        inc[0] = 1;

        //finding the increasing subsequence!!!!!
        for(int i = 1;i<n;i++){
            inc[i] = 1;
            dec[i] = 1;
            int j = i-1;
            while(j>=0){
                if(input[j]<input[i]){
                    inc[i] = Math.max(inc[i], inc[j]+1);
                }
                j--;
            }
        }

        dec[n-1] = 1;
        for(int i =n-2;i>=0;i--){
            dec[i] = 1;
            int j =i+1;
            while(j<n){
                if(input[j]<input[i]){
                    dec[i] = Math.max(dec[i], dec[j]+1);
                }
                j++;
            }
        }

        int ans = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            inc[i]+=dec[i];
            ans = Math.max(ans, inc[i]-1);
        }

        return ans;       


    }

}
