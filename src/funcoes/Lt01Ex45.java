package funcoes;

import javax.swing.JOptionPane;

public class Lt01Ex45{

    private static final String TITLE_EXER = "Serie 3";

    public static void main(String[] args) {
        String msgUser = gerarSerie3();
        JOptionPane.showMessageDialog(null, msgUser, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
    }

    public static String gerarSerie3() {
        String sequence = "";
        double resul = 0;
        int divisor;

        for (int dividendo = 1; dividendo <= 15; dividendo++) {
            divisor = dividendo * dividendo;
            resul += (double) dividendo / (double) divisor;
            sequence = sequence.concat(String.format("%d/%d %s", dividendo, divisor, (dividendo != 15) ? "+ " : ""));
            if (dividendo % 5 == 0) sequence = sequence.concat("\n");
        }

        return String.format("<Sequencia>%n%s%nResultado: %.2f", sequence, resul);
    }
}
