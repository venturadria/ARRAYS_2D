import java.util.Scanner;

public class Main {
    void main() {

        Scanner llegir = new Scanner(System.in);
        int n;
        int m;

        System.out.println("Quantes files vols?");
        n =  llegir.nextInt();
        System.out.println("Quantes columnes vols?");
        m =  llegir.nextInt();

        int[][] valors = new int[m][n];
        int[] sumacolumnes = new int[n];

        for (int i = 0; i < valors.length; i++) {
            for (int j = 0; j < valors[i].length; j++) {
                System.out.println("Introdueix el valor de la fila " + (i+1) + " en la columna " + (j+1) + ":");
                valors[i][j] = llegir.nextInt();
                sumacolumnes[j] += valors[i][j];
            }
        }

        System.out.print("| ");
        for (int i = 0; i < sumacolumnes.length; i++) {
            System.out.print("Fila " + i + " = " + sumacolumnes[i] +  " | ");
        }


    }
}
