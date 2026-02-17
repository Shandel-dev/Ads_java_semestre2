package funcoes;

import javax.swing.JOptionPane;

public class Lt01Ex33 {

    private static final String TITLE_EXER = "Sequência de números";

    public static void main(String[] args) {
        int numLimit;
        do {
            numLimit = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o limite da série (entre 1 e 100): "));
            if (!(numLimit >= 1 && numLimit <= 100)) JOptionPane.showMessageDialog(null, "Entrada de dado fora dos limites!\nPor favor, insira um número entre 1 e 100 (inclusive)", TITLE_EXER, JOptionPane.ERROR_MESSAGE);
        } while (!(numLimit >= 1 && numLimit <= 100));

        String msgResul = gerarSerie(numLimit);
        JOptionPane.showMessageDialog(null, msgResul, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
    }

    public static String gerarSerie(int numLimit) {
        double resul = 0.0;
        String msgSequence = "";

        for (int numCur = 1; numCur <= numLimit; numCur++) {
            resul += (1.0 / numCur);
            msgSequence = msgSequence.concat(String.format("1/%d %s", numCur, (numCur != numLimit) ? "+ " : ""));
            if (numCur % 10 == 0) msgSequence = msgSequence.concat("\n");
        }

        return String.format("<Sequência>%n%s%nResultado: %.2f", msgSequence, resul);
    }
}
