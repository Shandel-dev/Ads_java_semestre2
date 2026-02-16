package procedimentos;

import javax.swing.JOptionPane;

public class Lt01Ex20 {

	private static final String TITLE_EXER = "Equação de 2° Grau";

	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Coeficiente A:", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Coeficiente B:", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
		int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Coeficiente C:", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));

		calcularEquacao(a, b, c);
	}

	public static void calcularEquacao(int a, int b, int c) {

		int delta = b * b - 4 * a * c;
		String msgResultado;

		if (delta > 0) {

			double raiz1 = (-(b) + Math.sqrt(delta)) / (2.0 * a);
			double raiz2 = (-(b) - Math.sqrt(delta)) / (2.0 * a);

			msgResultado = String.format("Coeficientes: a = %d, b = %d, c = %d%nRaízes: (%.2f, %.2f)", a, b, c, raiz1, raiz2);

		} else {
			msgResultado = "Não existem duas raízes reais!";
		}

		JOptionPane.showMessageDialog(null, msgResultado, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
	}
}
