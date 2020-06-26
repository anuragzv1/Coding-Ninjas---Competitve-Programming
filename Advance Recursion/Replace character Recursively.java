
public class Solution {

    
    public static void replaceCharacterHelper(char ch[] , char c1, char c2, int i){
        if(i == ch.length)return;
        
        if(ch[i]==c1){
            ch[i]=c2;
            replaceCharacterHelper(ch , c1 ,c2 , i+1);
        }
        else replaceCharacterHelper(ch , c1,c2,i+1);
    }
    
	public static String replaceCharacter(String input, char c1, char c2) {
		
        char ch [] = new char [input.length()];
        for(int i =0;i<input.length();i++){
            ch[i]= input.charAt(i);
        }
        
        replaceCharacterHelper(ch , c1 ,c2 , 0);
        
        return new String(ch);
	}
}
