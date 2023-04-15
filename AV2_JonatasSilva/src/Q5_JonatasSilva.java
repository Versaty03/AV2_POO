import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q5_JonatasSilva {
    public static void main(String[] args) {
        String caminhoArquivo = "C:/Users/alunok12/Documents/av2/q5.txt";
        List<String> palavrasComLink = encontrarPalavrasComLink(caminhoArquivo);

        System.out.println("Palavras encontradas:");
        for (String palavra : palavrasComLink) {
            System.out.println(palavra);
        }
    }

    public static List<String> encontrarPalavrasComLink(String caminhoArquivo) {
        List<String> palavrasComLink = new ArrayList<>();

        try {
            File arquivo = new File(caminhoArquivo);
            Scanner scanner = new Scanner(arquivo);

            while (scanner.hasNext()) {
                String palavra = scanner.next();
                if (palavra.contains("link")) {
                    palavrasComLink.add(palavra);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("O arquivo não pôde ser encontrado.");
            e.printStackTrace();
        }

        return palavrasComLink;
    }
}