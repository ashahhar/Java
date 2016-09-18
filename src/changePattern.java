package com.user.xml;

/*	#Write a program to modify the string in following pattern, 
#Change odd words to uppercase and Reverse the even words. Make sure that the spaces (multiple) between the words remains as it is. 
#E.g.: 
#Input : "This is a test String!!" 
#Output: "THIS si A tset STRING!!"*/

import java.util.Arrays;
import java.util.List;

public class changePattern {
	
	public static void changePattern(String S){
		String[] str = S.split(" ");
		for(int i =0; i<str.length; i++){
			if(i%2==0){str[i]=str[i].toUpperCase();}
			else{ 
				StringBuffer buf = new StringBuffer(str[i]);
				str[i] =buf.reverse().toString();
				}
		}
		List<String> l5 = Arrays.asList(str);
		System.out.println(String.join(" ", l5));
	}
	public static void main(String[] args){
		
		String str = "This is a test String!!";
		changePattern(str);
	}

}
