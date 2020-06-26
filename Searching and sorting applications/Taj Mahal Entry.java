import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
        int windows[]  = new int[n];
        for(int i = 0;i<n;i++){
            windows[i]= sc.nextInt();
        }
        int times[] = new int[n];
        for(int i =0;i<n;i++){
            
            if(windows[i]-i <0){
                times[i]= 0;
                continue;
            }
            
            if((windows[i]-i)%n != 0 ){
                times[i]  = 1+ (windows[i]-i)/n;
            }
            else times[i] = (windows[i]-i)/n;
            
        }
        
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int i = 0;i<n;i++){
            //System.out.println(times[i]+" ");
            if(times[i] <min){
                min = times[i];
                minIndex = i;
            }
        }
        
        System.out.println(minIndex+1);
	}
}
