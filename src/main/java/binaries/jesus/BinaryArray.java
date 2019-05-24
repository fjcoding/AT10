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
        //throw new UnsupportedOperationException("Not supported yet.");
        if (binaries==null) {
            return 0;
        }

        int [] arrPow=new int [binaries.length];
        for (int i = 0; i < binaries.length; i++) {
            arrPow[i]= (int) pow(binaries)[i];
        }
        return sumPow(arrPow,binaries);
    }

    public int sumPow(int [] arrPow,int arrBinary[]){
        int sum=0;
        for (int i = 0; i <arrBinary.length ; i++) {
            if (arrBinary[i]==1){
                sum+=arrPow[i];
            }
        }
        return sum;
    }

    public  double [] pow(int arrayBinary[]){
        double [] arrPow= new double[arrayBinary.length];
        int suma=0;
        int position=0;
        for (int i = arrayBinary.length-1; i >=0; i--) {
            arrPow[position] = Math.pow(2, i);
            position++;
        }
        return arrPow;
    }

}