import java.util.Scanner;

public class Q1_JonatasSilva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma sequência de números inteiros separados por espaço: ");
        String[] numeros = scanner.nextLine().split(" ");

        int soma = 0;
        for (String numero : numeros) {
            soma += Integer.parseInt(numero);
        }

        System.out.println("A soma dos números informados é: " + soma);
    }
}