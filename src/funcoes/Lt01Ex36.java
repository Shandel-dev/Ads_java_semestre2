package funcoes;

import javax.swing.JOptionPane;

public class Lt01Ex36{

    private static final String TITLE_EXER = "Sequencia com fatorial";

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o limite da sequencia", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
        String msgResul = gerarSerieFatorial(num);
        JOptionPane.showMessageDialog(null, msgResul, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
    }

    public static String gerarSerieFatorial(int num) {
        double resul = 0.0;
        String msgSequence = "";
        for (int curr = 0; curr <= num; curr++) {
            int fatorial = 1;
            for (int i = 1; i <= curr; i++) fatorial *= i;
            resul += 1.0 / fatorial;
            msgSequence = msgSequence.concat(String.format("1/%d! %s", curr, (curr != num) ? "+ " : ""));
            if (curr % 10 == 0 && curr != 0) msgSequence = msgSequence.concat("\n");
        }
        return String.format("<Sequencia>%n%s%nResultado: %.2f", msgSequence, resul);
    }
}
