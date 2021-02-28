package week3;
/*
 * 	Author: Rosa C. Rodriguez
 *  File: DeleteCharactersFromString.java
 *  Week3
 */
import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {
	
	
	public void run() {
		
		println("This is a test, t");
		println(removeAllOccurrences("This is a test", 't'));
		
		
		println("Summer is here!, e");
		println(removeAllOccurrences("Summer is here!", 'e'));
		
		
		println("---0---, -");
		println(removeAllOccurrences("---0---", '-'));
	
	}
	
	public String removeAllOccurrences(String str, char ch) {
		String newStr = "";
		for (int i=0; i<str.length(); i++) {
			
			if (str.charAt(i) != ch) {
				newStr = newStr + str.charAt(i);				
			}
		}
		return newStr;
	}
	
}
