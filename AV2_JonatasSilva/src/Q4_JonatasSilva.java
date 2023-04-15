import java.util.Scanner;

public class Q4_JonatasSilva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string: ");
        String entrada = scanner.nextLine();

        String[] tokens = entrada.split(" ");
        for (String token : tokens) {
            if (token.startsWith("s")) {
                System.out.println(token);
            }
        }
    }
}