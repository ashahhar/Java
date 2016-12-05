
//Find the length of longest subarray whose addition equals/less than the given 
//integer k.

package com.user.xml;
import java.awt.List;
import java.util.ArrayList;

public class longestSubArray {
	private static int maxLength(int[] array, int k) 
	{
		int l = 1, max =0;
		while(l<array.length)
		{
			int a=0;
			for(int i=l; i<=array.length;i++)
			{
				int sum=0,c=0;
				ArrayList lst =new ArrayList();
				for(int j =a; j<i; j++)
				{
					lst.add(array[j]);
					sum +=array[j];
					c++;
					//System.out.println(array[j]);
					if(sum <=k && max<c)
					{
						max =c;
					}
				}
				System.out.println(lst);
				a++;
				//System.out.println("-------------------");
			}l++;
		}
		//			System.out.println("########################################");
		return max;
	}
	public static void main(String[] args){
		int[] array = {3,1,2,1,7, 8, 9};
		int k =21;
		int n = maxLength(array, k);
		System.out.println("Longest Subarray with length less than or equal to 24:" + n);
	}
}

