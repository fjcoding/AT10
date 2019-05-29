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

    static final String B = "b";
    static final String H = "h";
    
    public static void main(String[] args) {
        String student = getStudent(args);
        int[] argsAsInts = toInts(args);
        String baseArg = getBase(args);
        printResult(student, argsAsInts, baseArg);
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
        for (int index = BINARY_START; index < (args.length - 1); index++) {
            
            if ((args[index].charAt(0) >= 'A') &&  ((args[index].charAt(0) <= 'F'))) {
                argsAsInts[index - 1] = (args[index].charAt(0)) - 55;
            }
            else if ((args[index].charAt(0) >= 'a') &&  ((args[index].charAt(0) <= 'f'))) {
                argsAsInts[index - 1] = (args[index].charAt(0)) - 87;
            }
            else if ((args[index].charAt(0) >= '0') &&  ((args[index].charAt(0) <= '9'))) {
                argsAsInts[index - 1] = Integer.parseInt(args[index]);
            }
            else {
                throw new IllegalArgumentException("Invalid digits entered!");
            }
        }
        return argsAsInts;
    }

    private static String getBase(String[] args) {
        String baseArg = args[args.length - 1];
        return baseArg;
    }
    
    private static void printResult(String student, int[] argsAsInts, String baseArg) {
        int result = 0;
        switch (baseArg) {
            case B:
                switch (student) {
                    case ALEJANDRO: result = new binaries.alejandro.BinaryArray(argsAsInts).ConvertToDecimalInt(); break;
                    case ANDRES: result = new binaries.andres.BinaryArray(argsAsInts).ConvertToDecimalInt(); break;
                    case JESUS: result = new binaries.jesus.BinaryArray(argsAsInts).ConvertToDecimalInt(); break;
                    case JOHN: result = new binaries.john.BinaryArray(argsAsInts).ConvertToDecimalInt(); break;
                    case JOSUE: result = new binaries.josue.BinaryArray(argsAsInts).ConvertToDecimalInt(); break;
                    case LIMBERT: result = new binaries.limbert.BinaryArray(argsAsInts).ConvertToDecimalInt(); break;
                    case MADAY: result = new binaries.maday.BinaryArray(argsAsInts).ConvertToDecimalInt(); break;
                    case MELISSA: result = new binaries.melissa.BinaryArray(argsAsInts).ConvertToDecimalInt(); break;
                    default: throw new IllegalArgumentException("Unknown student! who exactly are you?");
                }
                System.out.println(student + "'s result is: " + result);
                break;
            
            case H:
                switch (student) {
                    case ALEJANDRO: result = new binaries.alejandro.HexArray(argsAsInts).ConvertToDecimalInt(); break;
                    default: throw new IllegalArgumentException("Unknown student! who exactly are you?");
                }
                System.out.println(student + "'s result is: " + result);
                break;
            
            default: 
                throw new IllegalArgumentException("Invalid or missing base argument");

        }
    }
}
