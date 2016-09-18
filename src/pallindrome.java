
public class pallindrome {
	public static boolean isPalin(String st){
		char[]chArray = st.toCharArray();
		int i =0, j = chArray.length -1;
		while(i<j){
			if(chArray[i]!= chArray[j]){
				return false;
			}
			i++;j--;
		}
		return true;
	}
	public static void main(String[] args){
		String st = "hello";
		boolean result= isPalin(st);
		if(result){System.out.println("Is a Palindrome");}
		else{System.out.println("Not a Palindrome");}
	}
}
