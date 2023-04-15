import java.util.Scanner;

public class Q3_JonatasSilva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de entradas desejado: ");
        int n = scanner.nextInt();

        int soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Informe o " + (i + 1) + "º número inteiro: ");
            soma += scanner.nextInt();
        }

        System.out.println("A soma dos números informados é: " + soma);
    }
}