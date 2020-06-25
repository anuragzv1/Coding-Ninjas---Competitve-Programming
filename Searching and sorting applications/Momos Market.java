import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int prices[] = new int[n];
        for(int i = 0;i<n;i++){
            prices[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int money [] = new int [q];
        for(int i = 0;i<q;i++){
            money[i]  = sc.nextInt();
        }
        
        int cum[] = new int[n];
        cum[0]  = prices[0];
        for(int i =1;i<n;i++){
            cum[i] = cum[i-1]+prices[i];
        }
        
        for(int i = 0;i<q;i++){
            int cur_money = money[i];
            int index = getIndex(cum , cur_money);
            if(index ==-1){
                System.out.println("0 "+ cur_money);
            }
            else{
    
                System.out.println((index+1)+" "+ (cur_money-cum[index]));
            }
        }
	}
    
    public static int getIndex(int cum[] , int money){
        int ans = -1;
        int low =0;
        int high = cum.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(cum[mid] <=money){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
}
