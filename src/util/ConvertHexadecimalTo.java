package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConvertHexadecimalTo {
	
	public void convertHexadecimalToDecimal(String number) {
		
		String hexnum = number;
		
		int num = Integer.parseInt(hexnum, 16);
		
		System.out.print("Decimal: " + num);
		System.out.println();
		
	}
	
	public void convertHexadecimalToBinary(String number) {
		
		String hexnum = number;
		
		int num = Integer.parseInt(hexnum, 16);
		
		List<Integer> zeroOneList = new ArrayList<>();

		///// BUILDING THE SEQUENCE OF 0 1 REFERRING TO THE TYPED NUMBER/////
		while (num != 0) {
			int restOfDivision = num % 2;
			num /= 2;
			zeroOneList.add(restOfDivision);
		}

		Collections.reverse(zeroOneList); // REVERSING THE LIST TO SHOW THE CORRECT SEQUENCE//

		System.out.print("Binary: ");
		for(Integer i : zeroOneList) {
			System.out.print(i);
		}
		
		System.out.println();
		
	}
	
}
