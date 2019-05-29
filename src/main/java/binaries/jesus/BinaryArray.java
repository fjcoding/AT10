package binaries.jesus;

public class BinaryArray {
    /**
     * Array of 1s and 0s expected
     */ 
    private int[] binaries;
    /**
     * Simple constructor that assigns binaries list to instace's state
     */
    public BinaryArray(int[] binaries) {
        this.binaries = binaries;
    }
    /**
     * Returns the decimal numeric value equivalent to the list of binaries stored
     */
    public int ConvertToDecimalInt() {

        if (binaries == null) {
            return 0;
        }
        int [] arrPow=new int [binaries.length];
        try {
            for (int index = 0; index < binaries.length; index++) {
                arrPow[index] = (int) pow(binaries)[index];
            }

        }
        catch(Exception e){
            System.out.println("Something's wrong");
        }
        return sumPow(arrPow,binaries);
    }
    public int sumPow(int [] arrPow,int arrBinary[]){
        int sum=0;
        try{

            for (int index = 0; index <arrBinary.length ; index++) {
                if (arrBinary[index] == 1){
                    sum+=arrPow[index];
                }
            }

        }
        catch (Exception e){
            System.out.println("Could not sum the pow");
        }
        return sum;
    }
    public  double [] pow(int arrayBinary[]){
        double [] arrPow = new double[arrayBinary.length];
        int suma = 0;
        int position = 0;
        final int base = 2;
        try{
            for (int index = arrayBinary.length-1; index >= 0; index--) {
                arrPow[position] = Math.pow(base, index);
                position++;
            }
        }
        catch (Exception e){
            System.out.println("Could not pow");
        }
        return arrPow;

    }
}