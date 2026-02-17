package funcoes;

import javax.swing.JOptionPane;

public class Lt01Ex35{

    private static final String TITLE_EXER = "Soma de ímpares";

    public static void main(String[] args) {
        int initNum = Integer.parseInt(JOptionPane.showInputDialog(null, "1° valor: ", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
        int finalNum = Integer.parseInt(JOptionPane.showInputDialog(null, "2° valor", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
        String msgResul = somarImpares(initNum, finalNum);
        JOptionPane.showMessageDialog(null, msgResul, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
    }

    public static String somarImpares(int initNum, int finalNum) {
        int aux, resul = 0;
        if (initNum > finalNum) {
            aux = initNum;
            initNum = finalNum;
            finalNum = aux;
        }
        for (int num = initNum; num <= finalNum; num++) if (num % 2 != 0) resul += num;
        return String.format("Resultado da soma dos números ímpares entre %d e %d -> %d", initNum, finalNum, resul);
    }
}
