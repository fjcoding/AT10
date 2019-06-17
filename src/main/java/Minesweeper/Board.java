package Minesweeper;

public class Board {
    String tablero[][] = new String[100][100];
    int tableroNumber[][] = new int[100][100];
    int n;
    int m;
    int numeroMinas = 0;
    int intentos = 0;
    int tminas = 5;
    double a = 0;
    double b = 0;

    public boolean asignar(int n, int m){

        this.n=n;
        this.m=m;

        return true;
    }
    public boolean llenar (){
        for (int j = 0; j < n; j++)
            for (int i = 0; i < m; i++)
                tablero[j][i] = "*";
            return true;
    }
    public boolean Aleatorio(){
        do {
            a = Math.random() * 100;
            b = Math.random() * 100;
            a = (int) a;
            b = (int) b;
            if (b != 0 && a != 0 && b != 100 - 1 && a != 100 - 1) {
                tableroNumber[(int) a][(int) b] = 1;
                numeroMinas++;
            }
        } while (numeroMinas <= 5);
        return true;
    }
}
