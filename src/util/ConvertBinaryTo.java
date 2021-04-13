package util;

import java.util.ArrayList;
import java.util.List;

public class ConvertBinaryTo {

	public void convertBinaryToDecimal(long number) { //TO INCREASE THE POSSIBILITY OF 0 AND 1 SEQUENCE, I DECIDED TO USE LONG, INSTEAD INT//
		
		/////METHOD TO SPLIT THE SEQUENCE OF 0 AND 1/////
		List<Long> zeroOneList = new ArrayList<>();
		while(number > 0) {
			long digit = number % 10;
			number = number / 10;
			zeroOneList.add(digit);
		}
		
		/////METHOD TO SUM THE LIST OF 0 AND 1 SEQUENCES/////
		long sum = 0;
		for(long i=0; i<=zeroOneList.size() - 1; i++) {
			double pow = Math.pow(2, i);
			if(zeroOneList.get((int) i) == 1) {
				sum += pow;
			}
		
		}

		System.out.print("Decimal: " + sum);
		System.out.println();
		
	}
	
	public void convertBinaryToHexadecimal(long number) {
		
	/////METHOD TO SPLIT THE SEQUENCE OF 0 AND 1/////
		List<Long> zeroOneList = new ArrayList<>();
		List<Integer> restList = new ArrayList<>();
		while(number > 0) {
			long digit = number % 10;
			number = number / 10;
			zeroOneList.add(digit);
		}
		
		/////METHOD TO SUM THE LIST OF 0 AND 1 SEQUENCES/////
		long sum = 0;
		for(long i=0; i<=zeroOneList.size() - 1; i++) {
			double pow = Math.pow(2, i);
			if(zeroOneList.get((int) i) == 1) {
				sum += pow;
			}
		
		}
		
		while (sum > 15) {
			int rest = (int) (sum % 16);
			restList.add(rest); // ADDING THE REST OF EACH LOOP TO THE LIST//
			sum = sum / 16; // DECREASING THE RESULT TO THE LOWEST NUMBER POSSIBLE//
			if (sum < 16) { // DISCOVERING THE ELEMENT IF IT'S 15 OR LOWER (BECAUSE, IT'S THE ONLY ONE THAT
										// USE THE RESULT OF THE OPERATION, NOT THE REST)//
				if (sum == 10) {
					System.out.print("Hexadecimal: A");
				} else if (sum == 11) {
					System.out.print("Hexadecimal: B");
				} else if (sum == 12) {
					System.out.print("Hexadecimal: C");
				} else if (sum == 13) {
					System.out.print("Hexadecimal: D");
				} else if (sum == 14) {
					System.out.print("Hexadecimal: E");
				} else if (sum == 15) {
					System.out.print("Hexadecimal: F");
				} else {
					System.out.print("Hexadecimal: " + sum);
				}

			}

		}

		///// DISCOVERING THE REMAINING ELEMENTS OF THE HEXADECIMAL NUMBER/////
		for (int i = restList.size() - 1; i >= 0; i--) {
			if (restList.get(i) == 10) {
				System.out.print("A");
			} else if (restList.get(i) == 11) {
				System.out.print("B");
			} else if (restList.get(i) == 12) {
				System.out.print("C");
			} else if (restList.get(i) == 13) {
				System.out.print("D");
			} else if (restList.get(i) == 14) {
				System.out.print("E");
			} else if (restList.get(i) == 15) {
				System.out.print("F");
			} else {
				System.out.print(restList.get(i));
			}

		}
	
	}

}