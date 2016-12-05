package com.user.xml;

import java.util.Random;

//generate a random string of 20 characters [duplicate]
public class randString {

	public static void generateRandomStrings(String k){
		char[] array = k.toCharArray();
		Random rand = new  Random();
		StringBuffer sbuf = new StringBuffer();
		for(int i=0; i<20; i++){
			sbuf.append(array[rand.nextInt(array.length)]);
		}
		System.out.println(sbuf.toString());
	}
	public static void main(String[] args){
		String k = "abcdefghijklmnopqrstuvwxyz";
		generateRandomStrings(k);
	}
}
