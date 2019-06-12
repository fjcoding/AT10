package bankocr;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Entry {

    private List<Digit> digits;

    public Entry(Digit... digits) {
        this.digits = Arrays.asList(digits);
    }

    public String asNumbers() {
        StringBuilder numbersBuilder = new StringBuilder();
        Stream<Digit> digitsStream = digits.stream();
        Stream<Integer> intStream = digitsStream.map(digit -> new Integer(digit.intMode));
        intStream.forEach(numbersBuilder::append);
        return numbersBuilder.toString();
    }
}