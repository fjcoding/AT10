package KataBankOCR;

import java.util.HashMap;

public class Digit {
	String number;
	public Digit(String number) {
		this.number = number;
	}
	
	public Integer getDigit() {
		HashMap<String, Integer> stringToNumber = new HashMap<String, Integer>();
		stringToNumber.put(" _ "
  		                 + "| |"
                         + "|_|", 0);
		stringToNumber.put("   "
	 		             + "  |"
			             + "  |", 1);
	    stringToNumber.put(" _ "
		 		   		 + " _|"
				         + "|_ ", 2);
	    stringToNumber.put(" _ "
		   		         + " _|"
		                 + " _|", 3);
	    stringToNumber.put("   "
		   		         + "|_|"
		                 + "  |", 4);
	    stringToNumber.put(" _ "
  		                 + "|_ "
                         + " _|", 5);
	    stringToNumber.put(" _ "
	                     + "|_ "
                         + "|_|", 6);
	    stringToNumber.put(" _ "
	                     + "  |"
	                     + "  |", 7);
	    stringToNumber.put(" _ "
	                     + "|_|"
                         + "|_|", 8);
	    stringToNumber.put(" _ "
                         + "|_|"
                         + " _|", 9);
		return stringToNumber.get(number);
	}
}
