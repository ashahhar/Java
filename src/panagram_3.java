package com.user.xml;

public class panagram {
	
	public static boolean checkPanagram(String sent){
		String alpha = "abcdefghijklmnopqrstuvwx";
		char[] ch =alpha.toCharArray();
		sent =sent.toLowerCase();
		for(int i=0; i<ch.length; i++){
			if(sent.indexOf(ch[i])==-1){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		String sent = "We promptly judged antique ivory buckles for the next prize.";
		boolean bool =checkPanagram(sent);
		if(bool){System.out.println("is a panagram");}
		else{System.out.println("not a panagram");}
 	}
}
