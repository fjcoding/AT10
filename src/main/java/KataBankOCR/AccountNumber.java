package KataBankOCR;

public class AccountNumber {
	String head_number,body_number,foot_number;
	Integer accountNumber = 0;
	public AccountNumber(String head_number,String body_number,String foot_number) {
		this.head_number=head_number;
		this.body_number=body_number;
		this.foot_number=foot_number;
		
	}
	public Integer getAccountNumber() {
		 
		for(int index = 0; index<head_number.length();index+=3) {
			String actualNumber = head_number.substring(index, index+3)+body_number.substring(index, index+3)+foot_number.substring(index, index+3);
			Digit digit = new Digit(actualNumber);
			accountNumber = accountNumber*10+digit.getDigit();
		}
		return accountNumber;
	}
}
