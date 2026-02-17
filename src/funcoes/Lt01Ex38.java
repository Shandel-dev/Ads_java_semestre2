package funcoes;

import javax.swing.JOptionPane;

public class Lt01Ex38{

    private static final String TITLE_EXER = "Maior e menor valor";

    public static void main(String[] args) {
        String msgResul = calcularMaiorMenor();
        JOptionPane.showMessageDialog(null, msgResul, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
    }

    public static String calcularMaiorMenor() {
        final int QUANT_ENTRADA = 5;
        int numInput = 0;
        int numMax = 0, numMin = 0;

        for (int i = 1; i <= QUANT_ENTRADA; i++) {
            do {
                String msgInput = String.format("%d° valor: ", i);
                numInput = Integer.parseInt(JOptionPane.showInputDialog(null, msgInput, TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
                if (numInput < 0) JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", TITLE_EXER, JOptionPane.ERROR_MESSAGE);
            } while (numInput < 0);

            if (numMax == 0 && numMin == 0) {
                numMax = numInput;
                numMin = numInput;
            }

            if (numInput > numMax) numMax = numInput;
            if (numInput < numMin) numMin = numInput;
        }

        return String.format("Valor máximo: %d%nValor mínimo: %d", numMax, numMin);
    }
}
