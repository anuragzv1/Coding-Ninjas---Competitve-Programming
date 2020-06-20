import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String str = in.next();
		int freq[] = new int[26];
        for(int i = 0;i<str.length();i++){
            int index = str.charAt(i) - 97;
            // System.out.println(index);
            freq[str.charAt(i)-97]++;
        }
        
        System.out.println(freq['a' - 97]+" "+freq['s'-97]+" "+freq['p'-97]);
	}
}
