package week3;
/*Section Handout #4: String Processing
Portions of this handout by Eric Roberts and Patrick Young
1. Adding commas to numeric strings (Chapter 8, Exercise 13, page 290)
When large numbers are written out on paper, it is traditional—at least in the United
States—to use commas to separate the digits into groups of three. For example, the
number one million is usually written in the following form:
1,000,000
To make it easier for programmers to display numbers in this fashion, implement a
method
private String addCommasToNumericString(String digits)
that takes a string of decimal digits representing a number and returns the string formed
by inserting commas at every third position, starting on the right. For example, if you
were to execute the main program
	public void run() {
		while (true) {
			String digits = readLine("Enter a numeric string: ");
			if (digits.length() == 0) break;
			println(addCommasToNumericString(digits));
		}
}
* 	Author: Rosa C. Rodriguez
* 	File: AddCommasToNumberStrings.java
* 	Week3
*/

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {
	
	public void run() {
		while (true) {
			String digits = readLine("Enter a numeric string: ");
			if (digits.length() == 0) break;
			println(addCommasToNumericString(digits));
		}
	}

	private String addCommasToNumericString (String digits) {
		String digitsCommas = "";
		int count = 0;	
		if (digits.length() > 3) {	
			for (int i = digits.length()-1; i >= 0; i--) {
				digitsCommas = digits.charAt(i) + digitsCommas;
				// Every three characters a "," must be concatenated
				count+=1;				
				if (count == 3 && i>0) {
					digitsCommas = "," + digitsCommas;
					count=0;
				}
			} 
		} else { 
			// string length <= 3 do not need commas
			return digits;
		}
		// return string with commas
		return digitsCommas;
	}
}
