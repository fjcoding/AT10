package Minesweeper;

public class Board {
    String tablero[][] = new String[100][100];
    int filasN;
    int columnasM;
    int numeroMinas = 0;
    int intentos = 0;
    int tminas = 5;
    double numberA = 0;
    double numberB = 0;
    /*
    Asignamos el numero de filas n y el numero de columnas.
    */
    public boolean asignar(int n, int m) {
        this.filasN = n;
        this.columnasM = m;
        return true;
    }
    /*
    En este metodo llenamos la matriz con .
     */
    public boolean llenar() {
        for (int index = 0; index < filasN; index++)
            for (int indexj = 0; indexj < columnasM; indexj++)
                tablero[index][indexj] = ".";
        return true;
    }
    /*
    Aca se asigna valores que son los asteriscos que representan las bombas
     */
    public boolean Aleatorio() {
        do {
            numberA = Math.random() * 100;
            numberB = Math.random() * 100;
            numberA = (int) numberA;
            numberB = (int) numberB;
            if (numberB != 0 && numberA != 0 && numberB != 100 - 1 && numberA != 100 - 1) {
                tablero[(int) numberA][(int) numberB] = "*";
                numeroMinas++;
            }
        } while (numeroMinas <= 5);
        return true;
    }
}
