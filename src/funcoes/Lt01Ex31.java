package funcoes;

import javax.swing.JOptionPane;

public class Lt01Ex31{

    public static void main(String[] args) {
    	String titleExer = "Quadrados do 10 ao 150";
        
        String resultado = gerarQuadrados(10, 150);
        
        JOptionPane.showMessageDialog(null, resultado, titleExer, JOptionPane.INFORMATION_MESSAGE);
    }

    public static String gerarQuadrados(int inicio, int fim) {
        StringBuilder msgResul = new StringBuilder();

        for (int i = inicio; i <= fim; i++) {
            double resulSquare = Math.pow(i, 2);

            if (i % 10 == 0 && i != inicio) {
                msgResul.append("\n");
            }

            msgResul.append(String.format("%3d² = %6.0f | ", i, resulSquare));
        }

        return msgResul.toString();
    }
}
