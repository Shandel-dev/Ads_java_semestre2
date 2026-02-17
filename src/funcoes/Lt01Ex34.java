package funcoes;

import javax.swing.JOptionPane;

public class Lt01Ex34 {

    private static final String TITLE_EXER = "Tabuada";

    public static void main(String[] args) {
        int num;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual tabuada deseja gerar? (entre 1 e 100):", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
            if (!(num >= 1 && num <= 100)) JOptionPane.showMessageDialog(null, "Insira um valor no intervalo estabelecido!", TITLE_EXER, JOptionPane.ERROR_MESSAGE);
        } while (!(num >= 1 && num <= 100));

        String tableMulti = gerarTabuada(num);
        JOptionPane.showMessageDialog(null, tableMulti, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
    }

    public static String gerarTabuada(int num) {
        String tableMulti = "Tabuada do " + num + ":";
        for (int curr = 0; curr <= 10; curr++) tableMulti = tableMulti.concat(String.format("%d x %d = %d%n", num, curr, num * curr));
        return tableMulti;
    }
}
