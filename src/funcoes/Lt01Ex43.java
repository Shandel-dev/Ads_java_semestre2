package funcoes;

import javax.swing.JOptionPane;

public class Lt01Ex43 {

    private static final String TITLE_EXER = "Ana e Maria";

    public static void main(String[] args) {
        String msgUser = calcularAnos();
        JOptionPane.showMessageDialog(null, msgUser, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
    }

    public static String calcularAnos() {
        double anaAltura = 1.1, mariaAltura = 1.5;
        int anos = 0;
        String msg = "";

        while (anaAltura < mariaAltura) {
            anaAltura += 0.03;
            mariaAltura += 0.02;
            if (anaAltura > mariaAltura) msg = String.format("Altura de Ana: %.2f%nAltura de Maria: %.2f%nDemorou %d anos para que Ana seja mais alta que Maria", anaAltura, mariaAltura, anos);
            else anos++;
        }

        return msg;
    }
}
