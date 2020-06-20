import java.util.*;
import java.lang.String;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String strArray[] = sc.nextLine().split(" ");
        
        HashMap<String , Integer> map = new HashMap<>();
        for(int i = 0;i<strArray.length;i++){
            if(map.containsKey(strArray[i])){
                int val = map.get(strArray[i]);
                map.put(strArray[i], val+1);
            }
            else{
                map.put(strArray[i], 1);
            }
        }
        
        boolean noResult = true;
        for(Map.Entry<String , Integer>entry : map.entrySet()){
            if(entry.getValue() >1){
                System.out.println(entry.getKey()+" "+entry.getValue());
                noResult = false;
            }
        }
        if(noResult)System.out.println("-1");
        
	}

}
