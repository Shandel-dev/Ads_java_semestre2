package funcoes;

import javax.swing.JOptionPane;

public class Lt01Ex32{

    private static final String TITLE_EXER = "Fatorial de um número";

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
        int fatorial = calcularFatorial(num);
        JOptionPane.showMessageDialog(null, fatorial, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
    }

    public static int calcularFatorial(int num) {
        int fatorial = 1;
        for (int i = 1; i <= num; i++) fatorial *= i;
        return fatorial;
    }
}
