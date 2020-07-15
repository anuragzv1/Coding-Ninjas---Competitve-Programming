import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int i = sc.nextInt();
            int p = sc.nextInt();
            if((p+i)<=11){
                System.out.println(p+i);
            }
            else{
                int canCover = 11 - i;
                int cannotCover = p - canCover;
                System.out.println(cannotCover-1);
            }
        }
    }
}
