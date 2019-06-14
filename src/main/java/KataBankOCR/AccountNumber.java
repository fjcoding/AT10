package KataBankOCR;

public class AccountNumber {
    String head_number, body_number, foot_number;
    Integer accountNumber = 0;

    public AccountNumber(String head_number, String body_number, String foot_number) {
        this.head_number = head_number;
        this.body_number = body_number;
        this.foot_number = foot_number;

    }

    public Integer getAccountNumber() {

        for (int index = 0; index < head_number.length(); index += 3) {
            String actualNumber = head_number.substring(index, index + 3) + body_number.substring(index, index + 3)
                    + foot_number.substring(index, index + 3);
            Digit digit = new Digit(actualNumber);
            accountNumber = accountNumber * 10 + digit.getDigit();
        }
        return accountNumber;
    }

    public String getAccountNumberToString() {
        Integer VALIDLENGTH = 9;
        String finalNumber = "";
        String convertedNumber = getAccountNumber().toString();
        for (int index = 0; index <= VALIDLENGTH - convertedNumber.length() - 1; index++) {
            finalNumber += "0";
        }
        finalNumber += convertedNumber;
        return finalNumber;
    }

    public Boolean validateAccountNumber() {
        Boolean answer = false;
        String convertNumber = getAccountNumberToString();
        Integer VALIDLENGTH = 9;
        Integer sum = 0;
        for (int index = 0; index < VALIDLENGTH; index++) {
            Character digitCharacter = convertNumber.charAt(index);
            sum += Character.getNumericValue(digitCharacter) * (VALIDLENGTH - index);
        }
        if (sum % 11 == 0) {
            answer = true;
        }
        return answer;
    }
}
