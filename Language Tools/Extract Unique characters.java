public class solution {

	public static String uniqueChar(String str){
		int freq[] = new int[256];
        
        
        String ans ="";
        for(int i =0;i<str.length();i++){
            if(freq[str.charAt(i)]==0){
                ans+=""+str.charAt(i);
            	freq[str.charAt(i)]++;
            }
        }
        return ans;

	}
}
