package funcoes;

import javax.swing.JOptionPane;

public class Lt01Ex37 {

    private static final String TITLE_EXER = "Série de Fibonnaci";

    public static void main(String[] args) {
        int numTarget = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tamanho da série que deseja: ", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
        String msgResul = gerarFibonacci(numTarget);
        JOptionPane.showMessageDialog(null, msgResul, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
    }

    public static String gerarFibonacci(int numTarget) {
        int penul = 0, ulti = 1, aux;
        String sequenceNumbers = "";
        for (int n = 1; n <= numTarget; n++) {
            sequenceNumbers = sequenceNumbers.concat(String.format("%d %s", penul, (n != numTarget) ? "- " : ""));
            aux = ulti;
            ulti += penul;
            penul = aux;
        }
        return String.format("<%d elementos>%n%s", numTarget, sequenceNumbers);
    }
}
