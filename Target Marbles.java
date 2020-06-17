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
        for(int i =0;i<n;i++){
            for(int j = i;j<n;j++){
                int sum = 0;
                String s = "";
                for(int k = i;k<=j;k++){
                    sum+=arr[k];
                    s+= " "+arr[k];
                }
                if(sum == target){
                    System.out.println("true");
                    System.out.println(s.trim());
                    return;
                }
            }
        }
        System.out.println("false");
    }

}
