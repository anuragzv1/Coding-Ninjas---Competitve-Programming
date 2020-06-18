import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();

        int arr[]  = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // for(int i =0;i<n;i++){
        //     for(int j = i;j<n;j++){
        //         int sum = 0;
        //         String s = "";
        //         for(int k = i;k<=j;k++){
        //             sum+=arr[k];
        //             s+= " "+arr[k];
        //         }
        //         if(sum == target){
        //             System.out.println("true");
        //             System.out.println(s.trim());
        //             return;
        //         }
        //     }
        // }
        // System.out.println("false");
        
        
        
        //Optimised approach
        
        int start = 0;
        int end = 0;
        int sum = arr[0];
        while(start<arr.length && end <arr.length){
            if(sum<target){
                end++;
                sum+=arr[end];
            }
            else if(sum >target){
                sum-=arr[start];
                start++;
            }
            else{
                System.out.println("true");
                for(int k = start ;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                return;
            }
        }
        
        System.out.print("false");
    }

}
