package funcoes;

import javax.swing.JOptionPane;

public class Lt01Ex42 {

    private static final String TITLE_EXER = "Série 2";

    public static void main(String[] args) {
        String msgUser = gerarSerie2();
        JOptionPane.showMessageDialog(null, msgUser, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
    }

    public static String gerarSerie2() {
        StringBuilder msgResul = new StringBuilder();
        int divisor = 1;
        double resul = 0.0;

        for (int dividendo = 1; dividendo <= 50; dividendo++) {
            msgResul.append(String.format("%d/%d %s", dividendo, divisor, (dividendo != 50) ? "+ " : ""));
            if (dividendo % 5 == 0) msgResul.append("\n");
            resul += (double) dividendo / (double) divisor;

            divisor += 2;
        }

        return String.format("<SEQUENCIA>%n%s%nResultado: %.2f", msgResul.toString(), resul);
    }
}
