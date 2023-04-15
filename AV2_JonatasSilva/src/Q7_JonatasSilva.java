import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q7_JonatasSilva {

    public static void main(String[] args) {

        // Define o nome do arquivo a ser lido
        String nomeArquivo = "numeros.txt";

        // Inicializa a variável para armazenar a soma
        int soma = 0;

        try {
            // Cria um objeto Scanner para ler o arquivo
            Scanner scanner = new Scanner(new File(nomeArquivo));

            // Percorre todas as linhas do arquivo
            while (scanner.hasNextLine()) {

                // Lê a próxima linha e converte para um inteiro
                String linha = scanner.nextLine();
                int numero = Integer.parseInt(linha);

                // Adiciona o número lido à soma
                soma += numero;
            }

            // Fecha o scanner
            scanner.close();

            // Imprime a soma
            System.out.println("A soma dos números no arquivo " + nomeArquivo + " é: " + soma);

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + nomeArquivo);
        } catch (NumberFormatException e) {
            System.out.println("Arquivo contém um número inválido.");
        }
    }
}