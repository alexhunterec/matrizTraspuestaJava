package MatrizTr;

import javax.swing.JOptionPane;

public class MetodosMatrizTraspuesta {

    private int fila, columna, valorMatriz;
    private int[][] matrizA, matrizAT;

    public void lecturaMatriz() {

        this.fila = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL TAMAÑO DE LA MATRIZ CUADRADA\nDigite numero de filas:"));
        this.columna = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL TAMAÑO DE LA MATRIZ CUADRADA\nDigite numero de columnas:"));

        this.matrizA = new int[this.fila][this.columna];
        this.matrizAT = new int[this.columna][this.fila];

    }

    public void presentarMatriz() {

        for (int i = 0; i < matrizA.length; i++) { //Filas
            for (int j = 0; j < matrizA[i].length; j++) { //Columnas
                this.valorMatriz = Integer.parseInt(JOptionPane.showInputDialog("INGRESE VALORES DE LA MATRIZ CUADRADA"
                        + "\nIngrese los valores de la fila " + (i + 1)));
                this.matrizA[i][j] = this.valorMatriz;

            }
        }
        System.out.println("------MATRIZ A INGRESADA------");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print(this.matrizA[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void trasponerMatriz() {

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                this.matrizAT[j][i] = this.matrizA[i][j];
            }
        }
        System.out.println("------ MATRIZ TRASPUESTA ------");
        for (int i = 0; i < matrizAT.length; i++) {
            for (int j = 0; j < matrizAT[i].length; j++) {
                System.out.print(this.matrizAT[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        MetodosMatrizTraspuesta pruebaTraspuesta = new MetodosMatrizTraspuesta();
        pruebaTraspuesta.lecturaMatriz();
        pruebaTraspuesta.presentarMatriz();
        pruebaTraspuesta.trasponerMatriz();
    }
}
