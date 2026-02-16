package procedimentos;

import javax.swing.JOptionPane;

public class Lt01Ex23 {

	private static final String TITLE_EXER = "Ordem Crescente de 4 números";

	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "1° valor:", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null, "2° valor:", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
		int c = Integer.parseInt(JOptionPane.showInputDialog(null, "3° valor:", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
		int d = Integer.parseInt(JOptionPane.showInputDialog(null, "4° valor:", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));

		mostrarOrdemCrescente(a, b, c, d);
	}

	public static void mostrarOrdemCrescente(int a, int b, int c, int d) {

		int aux;

		if (a > b) {
			aux = a;
			a = b;
			b = aux;
		}
		if (a > c) {
			aux = a;
			a = c;
			c = aux;
		}
		if (a > d) {
			aux = a;
			a = d;
			d = aux;
		}

		if (b > c) {
			aux = b;
			b = c;
			c = aux;
		}
		if (b > d) {
			aux = b;
			b = d;
			d = aux;
		}

		if (c > d) {
			aux = c;
			c = d;
			d = aux;
		}

		String msgResul = String.format("Ordem Crescente -> [%d, %d, %d, %d]", a, b, c, d);

		JOptionPane.showMessageDialog(null, msgResul, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
	}
}
