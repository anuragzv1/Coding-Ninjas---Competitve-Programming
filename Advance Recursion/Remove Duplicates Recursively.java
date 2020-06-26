public class Solution {

    
    public static void removeConsecutiveDuplicatesHelper(char [] ch, int index ){
        if(ch[index] =='\0')return ;
        
        if(ch[index]==ch[index+1]){
            int i = index;
            for(;ch[i]!='\0';i++){
                ch[i] = ch[i+1];
            }
            ch[i-1]= '\0';
            removeConsecutiveDuplicatesHelper(ch , index);
        }
        else removeConsecutiveDuplicatesHelper(ch , index +1);
    }
    
	public static String removeConsecutiveDuplicates(String s) {
		char ch [] = new char[s.length()+1];
        for(int i = 0;i<s.length();i++){
            ch[i] = s.charAt(i);
        }
        ch[s.length()] = '\0';
        
        removeConsecutiveDuplicatesHelper(ch , 0);
        
        return new String(ch).trim();
	}

}
