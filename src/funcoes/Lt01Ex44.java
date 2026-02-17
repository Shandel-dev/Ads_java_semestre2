package funcoes;

import javax.swing.JOptionPane;

public class Lt01Ex44{

    private static final String TITLE_EXER = "Potência";

    public static void main(String[] args) {
        int base = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a base: ", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
        int expoente = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a potência: ", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));

        int resultado = calcularPotencia(base, expoente);
        String msgUser = String.format("%d elevado a %d é igual a %d", base, expoente, resultado);

        JOptionPane.showMessageDialog(null, msgUser, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
    }

    public static int calcularPotencia(int base, int expoente) {
        int resul = 1;
        for (int i = 1; i <= expoente; i++) {
            resul *= base;
        }
        return resul;
    }
}
