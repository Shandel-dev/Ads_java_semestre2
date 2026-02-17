package funcoes;

import javax.swing.JOptionPane;

public class Lt01Ex40 {

    private static final String TITLE_EXER = "Números Primos";

    public static void main(String[] args) {
        int valueA = Integer.parseInt(JOptionPane.showInputDialog(null, "1° valor: ", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
        int valueB = Integer.parseInt(JOptionPane.showInputDialog(null, "2° valor: ", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));

        if (valueB < valueA) {
            int aux = valueA;
            valueA = valueB;
            valueB = aux;
        }

        String msgUser = gerarPrimos(valueA, valueB);
        JOptionPane.showMessageDialog(null, msgUser, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
    }

    public static String gerarPrimos(int valueA, int valueB) {
        StringBuilder sequence_primos = new StringBuilder();

        for (int curr = valueA; curr <= valueB; curr++) {
            if (ehPrimo(curr)) sequence_primos.append(String.format("%d %s", curr, "- "));
        }

        return String.format("<Sequencia de primos entre %d e %d>%n%s", valueA, valueB, sequence_primos.toString());
    }

    public static boolean ehPrimo(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
