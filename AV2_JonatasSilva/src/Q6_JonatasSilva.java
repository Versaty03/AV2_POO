import java.util.Random;
import java.util.Scanner;

public class Q6_JonatasSilva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de linhas da primeira matriz: ");
        int linhasA = scanner.nextInt();

        System.out.print("Informe o número de colunas da primeira matriz: ");
        int colunasA = scanner.nextInt();

        System.out.print("Informe o número de linhas da segunda matriz: ");
        int linhasB = scanner.nextInt();

        System.out.print("Informe o número de colunas da segunda matriz: ");
        int colunasB = scanner.nextInt();

        if (colunasA != linhasB) {
            System.out.println("As dimensões das matrizes não são compatíveis para a multiplicação.");
        } else {
            int[][] matrizA = gerarMatrizAleatoria(linhasA, colunasA);
            int[][] matrizB = gerarMatrizAleatoria(linhasB, colunasB);

            int[][] resultado = multiplicarMatrizes(matrizA, matrizB);

            System.out.println("Resultado da multiplicação:");
            imprimirMatriz(resultado);
        }

        scanner.close();
    }

    public static int[][] gerarMatrizAleatoria(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        Random random = new Random();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = random.nextInt(10); // valores aleatórios de 0 a 9
            }
        }

        return matriz;
    }

    public static int[][] multiplicarMatrizes(int[][] matrizA, int[][] matrizB) {
        int linhasA = matrizA.length;
        int colunasA = matrizA[0].length;
        int linhasB = matrizB.length;
        int colunasB = matrizB[0].length;

        int[][] resultado = new int[linhasA][colunasB];

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }

    public static void imprimirMatriz(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}