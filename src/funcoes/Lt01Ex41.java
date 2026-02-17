package funcoes;

import javax.swing.JOptionPane;

public class Lt01Ex41 {

    private static final String TITLE_EXER = "Dois dados";

    public static void main(String[] args) {
        String msgUser = gerarCombinacoesSete();
        JOptionPane.showMessageDialog(null, msgUser, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
    }

    public static String gerarCombinacoesSete() {
        StringBuilder msgResul = new StringBuilder();

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == 7) msgResul.append(String.format("D1: %d + D2: %d%n", i, j));
            }
        }

        return String.format("Possibilidades de dados que somam 7%n%s", msgResul.toString());
    }
}
