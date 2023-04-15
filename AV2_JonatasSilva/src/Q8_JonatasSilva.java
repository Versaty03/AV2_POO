import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q8_JonatasSilva extends JFrame implements ActionListener {

    private static final int NUM_MAXIMO = 20;
    private static final int NUM_TENTATIVAS = 5;
    private static final String TITULO = "Adivinhação";
    private static final String TEXTO_TENTATIVA = "Tentativa: ";

    private int numEscolhido;
    private int tentativaAtual;
    private int tentativasRestantes;
    private JLabel tentativaLabel;
    private JButton[] botoesNumeros;
    private JTextField resultadoTextField;

    public Q8_JonatasSilva() {
        super(TITULO);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Inicializa os componentes da GUI
        numEscolhido = (int) (Math.random() * NUM_MAXIMO) + 1;
        tentativaAtual = 0;
        tentativasRestantes = NUM_TENTATIVAS;
        tentativaLabel = new JLabel(TEXTO_TENTATIVA + (tentativaAtual + 1) + " de " + NUM_TENTATIVAS);
        resultadoTextField = new JTextField(30);
        botoesNumeros = new JButton[NUM_MAXIMO];
        JPanel botoesPanel = new JPanel(new GridLayout(4, 5));
        for (int i = 0; i < NUM_MAXIMO; i++) {
            botoesNumeros[i] = new JButton("" + (i + 1));
            botoesNumeros[i].addActionListener(this);
            botoesPanel.add(botoesNumeros[i]);
        }

        // Adiciona os componentes à janela principal
        add(tentativaLabel, BorderLayout.NORTH);
        add(botoesPanel, BorderLayout.CENTER);
        add(resultadoTextField, BorderLayout.SOUTH);

        // Exibe a janela principal
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton botaoClicado = (JButton) e.getSource();
        int numClicado = Integer.parseInt(botaoClicado.getText());
        tentativaAtual++;
        tentativasRestantes--;
        tentativaLabel.setText(TEXTO_TENTATIVA + (tentativaAtual + 1) + " de " + NUM_TENTATIVAS);
        if (numClicado == numEscolhido) {
            resultadoTextField.setText("Você acertou!");
        } else {
            if (tentativasRestantes > 0) {
                resultadoTextField.setText("Você errou. Tente novamente.");
            } else {
                resultadoTextField.setText("Você perdeu. O número era " + numEscolhido + ".");
                for (int i = 0; i < NUM_MAXIMO; i++) {
                    botoesNumeros[i].setEnabled(false);
                }
            }
        }
    }

    public static void main(String[] args) {
        Q8_JonatasSilva gui = new Q8_JonatasSilva();
    }
}