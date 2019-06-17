package Minesweeper;
import java.util.Scanner;
public class Board {
    String tablero[][] = new String[100][100];
    int n;
    int m;
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
}
