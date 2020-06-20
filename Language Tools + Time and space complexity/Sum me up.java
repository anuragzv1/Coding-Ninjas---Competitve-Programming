import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0;i<t;i++){
            String num = sc.next();
            
            int sum = 0;
            for(int x = 0;x<num.length();x++){
                sum += num.charAt(x)-48;
            }
            System.out.println(sum);
        }
		
	}
}
