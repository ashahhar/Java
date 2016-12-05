package com.user.xml;

public class parseRoman {
	
	public static void numParser(java.lang.String romanNumber){
		int decimal =0, lastNum =0;
		String num = romanNumber.toUpperCase();
		for(int i=num.length()-1; i>=0; i--){
			char c = num.charAt(i);
			switch(c){
			case 'M':
				decimal = calc(1000, lastNum, decimal );
				lastNum =1000;
				break;
			case 'D':
				decimal = calc(500, lastNum, decimal );
				lastNum =500;
				break;
			case 'C':
				decimal = calc(100, lastNum, decimal );
				lastNum =100;
				break;
			case 'L':
				decimal = calc(50, lastNum, decimal );
				lastNum =50;
				break;
			case 'X':
				decimal = calc(10, lastNum, decimal );
				lastNum =10;
				break;
			case 'V':
				decimal = calc(5, lastNum, decimal );
				lastNum =5;
				break;
			case 'I':
				decimal = calc(1, lastNum, decimal );
				lastNum =1;
				break;
			}
		}
		System.out.println(decimal);
	}
	public static int calc(int decimal, int lastNum, int lastDecimal){
		if(lastNum > decimal){
			return lastDecimal - decimal;
		}
		else{
			return lastDecimal + decimal;
		}
	}
	public static void main(String[] args){
		numParser("XXXIX");
	}

}
