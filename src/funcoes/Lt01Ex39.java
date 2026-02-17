package funcoes;

import java.math.BigInteger;
import javax.swing.JOptionPane;

public class Lt01Ex39 {

    private static final String TITLE_EXER = "Quantidade de grãos";

    public static void main(String[] args) {
        String msgResul = calcularGraos();
        JOptionPane.showMessageDialog(null, msgResul, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
    }

    public static String calcularGraos() {
        int casaNum = 1;
        BigInteger qdteNum = BigInteger.ONE;
        BigInteger totalGraos = BigInteger.ZERO;

        String casaSeq = "", qdteSeq = "", tableGrains = "Casa | Quantidade\n";

        for (int i = 1; i <= 64; i++) {
            casaSeq = casaSeq.concat(casaNum + " | ");
            qdteSeq = qdteSeq.concat(qdteNum + " | ");
            tableGrains = tableGrains.concat(String.format("%8d | %s%n", casaNum, qdteNum));

            totalGraos = totalGraos.add(qdteNum);

            casaNum++;
            qdteNum = qdteNum.multiply(BigInteger.valueOf(2));
        }

        return String.format("%s%n%s", totalGraos, tableGrains);
    }
}
