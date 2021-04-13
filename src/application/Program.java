package application;

import java.util.Locale;
import java.util.Scanner;

import util.ConvertBinaryTo;
import util.ConvertDecimalTo;
import util.ConvertHexadecimalTo;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ConvertBinaryTo binaryTo = new ConvertBinaryTo();
		ConvertDecimalTo decimalTo = new ConvertDecimalTo();
		ConvertHexadecimalTo hexadecimalTo = new ConvertHexadecimalTo();
		
		System.out.println("Select the kind of number you actually have: ");
		System.out.println("1 - If you have a decimal number");
		System.out.println("2 - If you have a binary number");
		System.out.println("3 - If you have a hexadecimal number");
		System.out.println();
		System.out.print("Enter an option: ");
		int option = sc.nextInt();
		System.out.println();
		
		if(option == 1) {
			System.out.print("Type the number: ");
			int number = sc.nextInt();
			decimalTo.convertDecimalToBinary(number);
			decimalTo.convertDecimalToHexadecimal(number);
		}
		else if(option == 2) {
			System.out.print("Type the number: ");
			long number = sc.nextLong();
			binaryTo.convertBinaryToDecimal(number);
			binaryTo.convertBinaryToHexadecimal(number);
		}
		else if(option == 3) {
			System.out.print("Type the number: ");
			String number = sc.next();
			hexadecimalTo.convertHexadecimalToDecimal(number);
			hexadecimalTo.convertHexadecimalToBinary(number);
		}
		
		sc.close();

	}

}
