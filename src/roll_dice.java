package com.user.xml;

import java.util.Scanner;

public class rollDice {
	public static void roll_dice(String roll_again){
		if(roll_again.equals("yes")|| roll_again.equals("y")){
			System.out.println((int )(Math. random() * 6 + 1));
			System.out.println((int )(Math. random() * 6 + 1));
		}
	}
	public static void main(String[] args){
		while(true){
			System.out.println("Please Tell what to do ?");
			Scanner sc= new Scanner(System.in);
			String roll_again =sc.nextLine();
			roll_dice(roll_again);
		}

	}
}
