package com.user.xml;

//How do you swap two values without creating a new variable
public class sawpNums {
	
	public static void swap(int a, int b){
		a =a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+ b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println(a+" "+ b);
	}
	public static void main(String[] args){
		int a=80, b=7;
		swap(a, b);
	}
}
