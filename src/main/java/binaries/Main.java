package binaries;

/**
 * Main class runner for BinaryArrau practice
 * DO NOT TOUCH THIS CLASS! just run it ;)
 *
 * How to execute this class?
 *      1. Open a command line interface (cmd, git bash, etc)
 *      2. Navigate to root project AT10
 *      3. Execute the following command:
 *          [WINDOWS CMD]>   gradlew.bat run --args="<your name> <input list of binaries>"
 *          [BASH]>          ./gradlew run --args="<your name> <input list of binaries>"
 */
public class Main {

    static final int MINIMAL_ARGS = 2;
    static final int STUDENT = 0;
    static final int BINARY_START = 1;

    // AT10 students
    static final String ALEJANDRO = "alejandro";
    static final String ANDRES = "andres";
    static final String JESUS = "jesus";
    static final String JOHN = "john";
    static final String JOSUE = "josue";
    static final String LIMBERT = "limbert";
    static final String MADAY = "maday";
    static final String MELISSA = "melissa";

    public static void main(String[] args) {
        if (args.length < MINIMAL_ARGS) {
            throw new IllegalArgumentException("Not enough arguments!");
        } else {
            /* Excluding name and source base arguments */
            int DIGITS_LENGTH = args.length - 2;

            String student = getStudent(args);
                String[] digits = new String[DIGITS_LENGTH];
            digits = getDigits(args);
            char baseArg = getBase(args);
            printResult(student, digits, baseArg);
        }
    }

    private static String getStudent(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("you forgot to specify the student... doh!");
        } else {
            return args[STUDENT];
        }
    }

    private static String[] getDigits(String[] args) {
        /* Excluding source base argument */
        int BINARY_END = args.length - 1;

        /* Excluding Student's name and source base arguments */
        int DIGITS_LENGTH = args.length - 2;
        
        String[] digits = new String[DIGITS_LENGTH];
        for (int index = BINARY_START; index < BINARY_END; index++) {
            digits[index - BINARY_START] = args[index];
        }
        return digits;
    }

    private static char getBase(String[] args) {
        int BASE_POSITION = args.length - 1;
        char baseArg = args[BASE_POSITION].charAt(0);
        return baseArg;
    }

    private static void printResult(String student, String[] digits, char baseArg) {
        int result = 0;
        switch (student) {
            case ALEJANDRO: result = new binaries.alejandro.BinaryArray(digits).ConvertToDecimalInt(baseArg); break;
            /*
            case ANDRES: result = new binaries.andres.BinaryArray(digits).ConvertToDecimalInt(); break;
            case JESUS: result = new binaries.jesus.BinaryArray(digits).ConvertToDecimalInt(); break;
            case JOHN: result = new binaries.john.BinaryArray(digits).ConvertToDecimalInt(); break;
            case JOSUE: result = new binaries.josue.BinaryArray(digits).ConvertToDecimalInt(); break;
            case LIMBERT: result = new binaries.limbert.BinaryArray(digits).ConvertToDecimalInt(); break;
            case MADAY: result = new binaries.maday.BinaryArray(digits).ConvertToDecimalInt(); break;
            case MELISSA: result = new binaries.melissa.BinaryArray(digits).ConvertToDecimalInt(); break;
            */
            default: throw new IllegalArgumentException("Unknown student! who are you?");
        }
        System.out.println(student + "'s result is: " + result);
    }
}
