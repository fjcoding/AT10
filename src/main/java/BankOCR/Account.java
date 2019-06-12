package BankOCR;

public class Account {
    public Account() {

    }

    public String convertNumber(Digit[] digits) {
        StringBuilder resultAux = new StringBuilder();
        int aux;
        for (int index = 0; index < digits.length; index++) {
            aux = digits[index].convertArrays();
            resultAux.append(aux);
        }
        String result = resultAux.toString();
        return result;
    }
}
