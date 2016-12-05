
public class foobar {
	public static void main(String[] args){
		String val = check(Integer.parseInt(args[0]));
		System.out.println(val);
	}

	public static String check(int k) {
		if(k%4 ==0 && k%7 ==0){
			return "FooBar";			
		}
		else{
			if(k%4 ==0){return "Foo";}
			if(k%7 ==0){return "Bar";}
			else{return "Not divisible by 4 & 7";}
		}
	}
}
