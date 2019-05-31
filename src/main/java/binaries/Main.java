package binaries;

/**
 * Main class runner for BinaryArrau practice
 * DO NOT TOUCH THIS CLASS! just run it ;)
 * <p>
 * How to execute this class?
 * 1. Open a command line interface (cmd, git bash, etc)
 * 2. Navigate to root project AT10
 * 3. Execute the following command:
 * [WINDOWS CMD]>   gradlew.bat run --args="<your name> <input list of binaries>"
 * [BASH]>          ./gradlew run --args="<your name> <input list of binaries>"
 */
public class Main {

    static final int STUDENT = 0;
    static final int START = 1;
    int base;

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
        String student = getStudent(args);
        char type = args[args.length - 1].charAt(0);
        if (type == 'b') {
            int[] argsAsInts = toInts(args);
            printResult(student, argsAsInts);
        } else if (type == 'h') {
            String[] argsAsDecimal = toDecimal(args);
            printResult(student, argsAsDecimal);
        }
    }

    private static String getStudent(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("you forgot to specify the student... doh!");
        } else {
            return args[STUDENT];
        }
    }

    private static int[] toInts(String[] args) {
        int[] argsAsInts = new int[args.length - 2];
        int i = 0;
        for (int index = START; index < args.length - 1; index++) {
            argsAsInts[i] = Integer.parseInt(args[index]);
            i++;
        }
        return argsAsInts;
    }

    private static String[] toDecimal(String[] args) {
        int i = 0;
        String[] argsAsDecimal = new String[args.length - 2];
        for (int index = START; index < args.length - 1; index++) {
            argsAsDecimal[i] = args[index];
            i++;
        }
        return argsAsDecimal;
    }

    private static void printResult(String student, int[] argsAsInts) {
        int result = 0;
        switch (student) {
            case ALEJANDRO:
                result = new binaries.alejandro.BinaryArray(argsAsInts).ConvertToDecimalInt();
                break;
            case ANDRES:
                result = new binaries.andres.BinaryArray(argsAsInts).ConvertToDecimalInt();
                break;
            case JESUS:
                result = new binaries.jesus.BinaryArray(argsAsInts).ConvertToDecimalInt();
                break;
            case JOHN:
                result = new binaries.john.BinaryArray(argsAsInts).ConvertToDecimalInt();
                break;
            case JOSUE:
                result = new binaries.josue.BinaryArray(argsAsInts).ConvertToDecimalInt();
                break;
            case LIMBERT:
                result = new binaries.limbert.BinaryArray(argsAsInts).ConvertToDecimalInt();
                break;
            case MADAY:
                result = new binaries.maday.BinaryArray(argsAsInts).ConvertToDecimalInt();
                break;
            case MELISSA:
                result = new binaries.melissa.BinaryArray(argsAsInts).ConvertToDecimalInt();
                break;
            default:
                throw new IllegalArgumentException("Unknown student! who are you?");
        }
        System.out.println(student + "'s result is: " + result);
    }

    private static void printResult(String student, String[] argsAsDecimal) {
        int result = 0;
        switch (student) {
            case MADAY:
                result = new binaries.maday.HexadecimalArray(argsAsDecimal).ConvertToDecimalInt();
                break;
            default:
                throw new IllegalArgumentException("Unknown student! who are you?");
        }
        System.out.println(student + "'s result is: " + result);
    }
}