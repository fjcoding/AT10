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

    public static void main(String[] args) {
        String student = getStudent(args);
        int[] argsAsInts = toInts(args);
        printResult(student, argsAsInts);
    }

    private static String getStudent(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("you forgot to specify the student... doh!");
        } else {
            return args[STUDENT];
        }
    }

    private static int[] toInts(String[] args) {
        int[] argsAsInts = new int[args.length];
        for (int index = BINARY_START; index < args.length; index++) {
            argsAsInts[index] = Integer.parseInt(args[index]);
        }
        return argsAsInts;
    }

    private static void printResult(String student, int[] argsAsInts) {
        int result = 0;
        switch (student) {
        }
        System.out.println(student + "'s result is: " + result);
    }
}