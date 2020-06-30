import java.util.*;
public class solution {

    public static String keys[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void keypadHelper(String input , String output , ArrayList<String> list){
        if(input.length()==0){
            list.add(output);
            return;
        }
        
        int index = Integer.parseInt(""+input.charAt(0));
        String key = keys[index];
        for(int i  =0;i<key.length();i++){
            keypadHelper(input.substring(1), output+key.charAt(i) , list);
        }
        
    }
    
    public static String[] keypad(int n){
    ArrayList<String> list = new ArrayList<>();
		keypadHelper(Integer.toString(n), "", list);
        String ans[] = new String[list.size()];
        for(int i =0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }

}
