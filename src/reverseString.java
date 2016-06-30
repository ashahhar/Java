// Reverse String
public class reverseString {
	public static String  revString(String k){
		if(k.length()==0){String m ="Please input valid string"; return m;}
		else{StringBuffer strBuf = new StringBuffer();
		for(int i =k.length()-1; i>=0; i-- ){
			strBuf.append(k.charAt(i));
		}
		return strBuf.toString();}
	} 
	public static void main (String[] args){
		System.out.println("Input String:" + args[0]);
		String r = revString(args[0]);
		System.out.println("Output String:" + r);
	}
}

