package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConvertDecimalTo {

	public void convertDecimalToBinary(int number) {

		List<Integer> zeroOneList = new ArrayList<>();

		///// BUILDING THE SEQUENCE OF 0 1 REFERRING TO THE TYPED NUMBER/////
		while (number != 0) {
			int restOfDivision = number % 2;
			number /= 2;
			zeroOneList.add(restOfDivision);
		}

		Collections.reverse(zeroOneList); // REVERSING THE LIST TO SHOW THE CORRECT SEQUENCE//

		System.out.print("Binary: ");
		for(Integer i : zeroOneList) {
			System.out.print(i);
		}
		
		System.out.println();
		
	}

	public void convertDecimalToHexadecimal(int number) {

		List<Integer> restList = new ArrayList<>(); // THIS LIST WAS BUILT TO USE AS REFERENCE FOR THE OUTPUT//
		int resultAccount = number; // IT WAS NECESSARY TO CREATE THIS VARIABLE OUT OF THE STRUCTURES TO USE AS
									// CONDITION INSIDE THE NEXT WHILE//

		///// DISCOVERING THE FIRST ELEMENT OF THE ENTERED NUMBER IN HEXADECIMAL/////
		while (resultAccount > 15) {
			int rest = resultAccount % 16;
			restList.add(rest); // ADDING THE REST OF EACH LOOP TO THE LIST//
			resultAccount = resultAccount / 16; // DECREASING THE RESULT TO THE LOWEST NUMBER POSSIBLE//
			if (resultAccount < 16) { // DISCOVERING THE ELEMENT IF IT'S 15 OR LOWER (BECAUSE, IT'S THE ONLY ONE THAT
										// USE THE RESULT OF THE OPERATION, NOT THE REST)//
				if (resultAccount == 10) {
					System.out.print("Hexadecimal: A");
				} else if (resultAccount == 11) {
					System.out.print("Hexadecimal: B");
				} else if (resultAccount == 12) {
					System.out.print("Hexadecimal: C");
				} else if (resultAccount == 13) {
					System.out.print("Hexadecimal: D");
				} else if (resultAccount == 14) {
					System.out.print("Hexadecimal: E");
				} else if (resultAccount == 15) {
					System.out.print("Hexadecimal: F");
				} else {
					System.out.print("Hexadecimal: " + resultAccount);
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
