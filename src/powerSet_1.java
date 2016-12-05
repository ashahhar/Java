package com.user.xml;

import java.util.ArrayList;

public class powerSet {

	public static void generatePowerSet(char[] S){
		int l =0 , max =0;
		ArrayList newlst =new ArrayList();
		if(l==0){newlst.add("[ ]"); l++;}
		while(l<=S.length)
		{
			int a=0;
			for(int i=l; i<=S.length;i++)
			{
				ArrayList lst =new ArrayList();
				for(int j =a; j<i; j++)
				{
					lst.add(S[j]);
//					System.out.println(lst[j]);
				}
//				System.out.println(lst);
				newlst.add(lst);
				a++;
				//System.out.println("-------------------");
			}
			l++;
		}System.out.println(newlst);
	}
	public static void main(String[] args){
		char[] S = {'a', 'b', 'c'};
		generatePowerSet(S);
	}

}
