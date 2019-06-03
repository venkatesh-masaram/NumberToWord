package com.virtusa.converter;

import java.util.Scanner;

public class NumberToWord {

	public static final String[] UNITS = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };

	public static final String[] TENS = { "", "", "Twenty","Thirty","Forty", "Fifty","Sixty","Seventy", "Eighty", "Ninety"};

	public static String convertToWord(int number) {
		if(number == 0) {
			return "Zero";
		}else {
			return printNumber(number);
		}
	}
	
	public static String printNumber(int number) {
		if (number < 0) {
			return "Minus " + printNumber(-number);
		}

		if (number < 20) {
			return UNITS[number];
		}

		if (number < 100) {
			return TENS[number / 10] + ((number % 10 != 0) ? " " : "") + UNITS[number % 10];
		}

		if (number < 1000) {
			return UNITS[number / 100] + " Hundred" + ((number % 100 != 0) ? " " : "") + printNumber(number % 100);
		}

		if (number < 1000000) {
			return printNumber(number / 1000) + " Thousand" + ((number % 1000 != 0) ? " " : "")
					+ printNumber(number % 1000);
		}

		if (number < 1000000000) {
			return printNumber(number / 1000000) + " Million" + ((number % 1000000 != 0) ? " " : "")
					+ printNumber(number % 1000000);
		}

		return null;
	}

	public static void main(final String[] args) {

		int n;
		System.out.println("Enter a number to convert into word format");
		
		try(Scanner scanner = new Scanner(System.in))  {
			n = scanner.nextInt();
			System.out.println(convertToWord(n));

		} catch (Exception e) {
			System.out.println("Wrong input. Enter only number");
		}

	}

}
