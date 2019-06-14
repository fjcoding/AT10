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
        int convertedDigit;
        // for (int arrayIndex = 0; arrayIndex < digits.length; arrayIndex++) {
        for (Digit item : digits) {
            convertedDigit = item.convertArrays();
            preResult.append(convertedDigit);
        }
        String result = preResult.toString();
        return result;
    }

    public int checkSum() {
        int sum = 0;
        int incremental = 1;
        for (int index = digits.size() - 1; index >= 0; index--) {
            int actualDigit = digits.get(index).convertArrays();
            sum += incremental * actualDigit;
            incremental++;
        }
        return sum % 11;
    }

    public Boolean isHexadecimal() {
        Boolean answer = false;
        for (Digit item : digits) {
            answer |= isHexDigit(item);
        }
        return answer;
    }

    public Boolean isHexDigit(Digit digit) {
        switch (digit.convertArrays()) {
        case 10:
            return true;
        case 11:
            return true;
        case 12:
            return true;
        case 13:
            return true;
        case 14:
            return true;
        case 15:
            return true;
        default:
            return false;
        }
    }

}
