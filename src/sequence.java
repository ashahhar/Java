package com.user.xml;


//print the number in sequence and reverse it
public class sequence {
	
	public static void sequence(){
		int i=1;
		for(int j =1; j>0;j+=i){
			if(j==10){
				i=-1;
			}
			System.out.print(j+" ");
		}
	}
	public static void main(String[] args){
		sequence();
	}
}
