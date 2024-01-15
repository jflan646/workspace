package ch7inclass2;

import java.util.Scanner;

public class phoneNumberFormat2 {
	public static void main(String[] args) {
		String phoneNumber = "9197187350";
		Scanner input = new Scanner(System.in);//new
		System.out.print("Enter 10 digit phone number on spaces or dashes or 999 to quit ");//new
		phoneNumber = input.next();//new
		while (!phoneNumber.equals("999")) {//new
			String formattedNumber = "";
			if(phoneNumber.length()!=10) { //new new 
				System.out.println("*****Error****Enter 10 digits"); //new new 
				System.out.print("Enter 10 digit phone number on spaces or dashes or 999 to quit ");//new new 
				phoneNumber = input.next();//new new 
				continue;//new new 
			}
			formattedNumber = "(" + phoneNumber.substring(0, 3) + ") ";
			formattedNumber = formattedNumber + phoneNumber.substring(3, 6) + "-";
			formattedNumber = formattedNumber + phoneNumber.substring(6);
			System.out.println("The formatted phone number is " + formattedNumber);
			System.out.print("Enter 10 digit phone number on spaces or dashes or 999 to quit ");//new
			phoneNumber = input.next();//new
		}//new

	}

}
