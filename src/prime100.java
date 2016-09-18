import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

// Print the prime numbers between 1to 100.
public class primeNumbers {

	public static void main(String[] args)
	{
		ArrayList num= primenum(1000); 
		System.out.println("Prime Numbers between 1 to 100:\n" + num);
	}
	public static ArrayList primenum(int a) {
		ArrayList x = new ArrayList();
		for(int i =1; i<a; i++)
		{
			boolean isPrime =true;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					isPrime =false;
					break;
				}
			}
			if(isPrime){ x.add(i);}
			//Write code to list the first 20 prime numbers
			if(x.size()== 20){return x;}
		}
		return null;
	}
}
