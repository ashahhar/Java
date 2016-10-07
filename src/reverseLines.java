package com.user.xml;

//Programming Challenge Description:
//A group of NLP researchers have developed a universal language translation system that can translate English to any foreign languages.
//Unfortunately, an error was introduced by a junior developer of the team, which resulted the system read input English sentences from right to left.
//Because this is the opposite of how English is written, the team asks you to write a program that fixes this error.
//In addition to the direction, you also have to modify the case of some letters such that only the leftmost character of a space-delimited word is in uppercase. The other letters in the word should be in lowercase.
//
//Input:
//Your program should read lines of text from standard input. Each line contains a single sentence.
//Output:
//Print to standard output each modified sentence, one sentence per line.
//
//Test 1
//Test Input: Hello Watson
//Expected Output: Nostaw Olleh
//Test 2
//Test Input: Thou art thyself though not a Montague - from Romeo and Juliet
//Expected Output: Teiluj Dna Oemor Morf - Eugatnom A Ton Hguoht Flesyht Tra Uoht
//IBM cognitive computing|IBM "cognitive" computing is a revolution| ibm cognitive  computing|'IBM Cognitive Computing' is a revolution?

import java.io.*;

public class reverseLines {
	public static void main(String[] args) throws IOException {
//	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//	    String s;
//	    while ((s = in.readLine()) != null) {
	    String s = "Thou art thyself though not a Montague - from Romeo and Juliet";
	    s = s.toLowerCase();
	    String[] newS= s.split(" ");
	    StringBuffer strb= new StringBuffer();
	    for(int i =newS.length-1; i>=0; i--){
	    	char[] c = newS[i].toCharArray();
	    	StringBuffer sbuf = new StringBuffer();
	    	for(int j=c.length-1; j>=0; j--){
	    		sbuf.append(c[j]);
	    	}
	    	String k = (sbuf.toString()).substring(0, 1).toUpperCase() + (sbuf.toString()).substring(1);
	    	strb.append(k + " ");
	    }
	    String res = strb.toString();
	    System.out.println(res);
	    }
	  }
