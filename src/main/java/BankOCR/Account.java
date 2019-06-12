package BankOCR;

import java.util.List;

public class Account {

    List<Digit> digits;

    public Account() {

    }

    public Account(List<Digit> digits) {
        this.digits = digits;
    }

    public String convertNumber() {
        StringBuilder preResult = new StringBuilder();
        Integer convertedDigit;
        for (Digit item : digits) {
            convertedDigit = item.convertArrays();
            preResult.append(convertedDigit);
        }
        String result = preResult.toString();
        return result;
    }

    public Boolean validateAccount() {
        Boolean answer = false;
        String convertedNumber = convertNumber();
        Integer sum = 0;
        Integer STRINGLENGTH = convertedNumber.length();
        for (int index = 0; index < STRINGLENGTH; index++) {
            Character characterDigit = convertedNumber.charAt(index);
            sum += Character.getNumericValue(characterDigit) * (STRINGLENGTH - index);
        }
        if (sum % 11 == 0) {
            answer = true;
        }
        return answer;
    }
}
