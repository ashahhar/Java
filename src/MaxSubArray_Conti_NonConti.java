import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Given an array A={a1,a2, ...., aN} of N elements, find the maximum possible sum of a
//Contiguous subarray
//Non-contiguous (not necessarily contiguous) subarray.
//Empty subarrays/subsequences should not be considered.
//Input Format
//First line of the input has an integer T. T cases follow. 
//Each test case begins with an integer N. In the next line, N integers follow representing the elements of array A.
//Output Format
//Two, space separated, integers denoting the maximum contiguous and non-contiguous subarray. At least one integer
//should be selected and put into the subarrays (this may be required in cases where all elements are negative).
//Sample Input:
//	2 
//	4 
//	1 2 3 4
//	6
//	2 -1 2 3 4 -5
//Sample Output:
//	10 10
//	10 11
//Explanation
//	In the first case: 
//	The max sum for both contiguous and non-contiguous elements is the sum of ALL the elements (as they are all positive).
//	In the second case: 
//	[2 -1 2 3 4] --> This forms the contiguous sub-array with the maximum sum. 
//	For the max sum of a not-necessarily-contiguous group of elements, simply add all the positive elements.	



public class MaxSubArray_Conti_NonConti {

	public static void continguousArray(int[] arr){
		int max_ending_here = 0;
		int max_so_far = Integer.MIN_VALUE;
		for(int x : arr){
			max_ending_here = Math.max(x, max_ending_here + x);
			max_so_far = Math.max(max_so_far, max_ending_here);
		}
		System.out.print(max_so_far);
		Arrays.sort(arr);
		int sum = 0;
		//if there is none positive value in entire array
		if(arr[arr.length-1] <= 0)
			sum = arr[arr.length - 1];
		//accumulate all positive values in entire array
		else{
			for(int x : arr){
				if(x > 0)
					sum += x;
			}
		}
		System.out.println(" " + sum);
	}

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scanner = new Scanner(System.in);
		int testcases = scanner.nextInt();
		while(scanner.hasNext()){
			//System.out.println(scanner.nextInt());  
			int n = scanner.nextInt();
			int[] array = new int[n];
			for(int i=0; i<n; i++){
				array[i]=scanner.nextInt();
			}
			continguousArray(array);
		}
	}
}
