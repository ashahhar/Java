package com.user.xml;
import java.util.Scanner;

// Finding square without using library functions
public class squareRootwithoutLibrary {
	public static double calc(double num){
		double prev;		
		double sq = 1;
		for(int n=0;n <1000;n++)
		{
			prev = sq;
			sq = (sq + num/sq)/2;
			if(prev == sq)
			{
				break;
			}
		}
		return sq;
	}
	public static void main(String args[]){
		while(true){
			System.out.println("Please enter the number");
			Scanner sc= new Scanner(System.in);
			double number = sc.nextDouble();
			System.out.println("Square of "+ number +" is " + calc(number));
		}
	}
	}
