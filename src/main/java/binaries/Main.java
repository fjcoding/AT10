package binaries;

/**
 * Main class runner for BinaryArrau practice DO NOT TOUCH THIS CLASS! just run
 * it ;)
 *
 * How to execute this class? 1. Open a command line interface (cmd, git bash,
 * etc) 2. Navigate to root project AT10 3. Execute the following command:
 * [WINDOWS CMD]> gradlew.bat run --args="<your name> <input list of binaries>"
 * [BASH]> ./gradlew run --args="<your name> <input list of binaries>"
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
		String[] argsAsInts = toInts(args);
		char base = getBase(args);
		printResult(student, argsAsInts, base);
	}

	private static String getStudent(String[] args) {
		if (args.length == 0) {
			throw new IllegalArgumentException(
					"you forgot to specify the student... doh!");
		} else {
			return args[STUDENT];
		}
	}

	private static String[] toInts(String[] args) {
		int cont=0;
		int argsLength = args.length;
		String[] argsAsInts = new String[argsLength-2];
		for (int index = BINARY_START; index < args.length-1; index++) {
			argsAsInts[cont] = args[index];
			cont++;
		}
		return argsAsInts;
	}
	private static char getBase(String[] args) {
		char base = args[args.length - 1].charAt(0);
		return base;
	}
	private static void printResult(String student, String[] argsAsInts, char base) {
		int result = 0;
		switch (student) {
			case ALEJANDRO :
				//result = new binaries.alejandro.BinaryArray(argsAsInts).ConvertToDecimalInt();
				break;
			case ANDRES :
				//result = new binaries.andres.BinaryArray(argsAsInts,base).ConvertToDecimalInt();
				break;
			case JESUS :
				//result = new binaries.jesus.BinaryArray(argsAsInts,base).ConvertToDecimalInt();
				break;
			case JOHN :
				//result = new binaries.john.BinaryArray(argsAsInts).ConvertToDecimalInt();
				break;
			case JOSUE :
				result = new binaries.josue.BinaryArray(argsAsInts,base).ConvertToDecimalInt();
				break;
			case LIMBERT :
				//result = new binaries.limbert.BinaryArray(argsAsInts).ConvertToDecimalInt();
				break;
			case MADAY :
				//result = new binaries.maday.BinaryArray(argsAsInts).ConvertToDecimalInt();
				break;
			case MELISSA :
				//result = new binaries.melissa.BinaryArray(argsAsInts).ConvertToDecimalInt();
				break;
			default :
				throw new IllegalArgumentException(
						"Unknown student! who are you?");
		}
		System.out.println(student + "'s result is: " + result);
	}
}