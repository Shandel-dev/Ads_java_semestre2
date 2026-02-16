package procedimentos;

import javax.swing.JOptionPane;

public class Lt01Ex22 {

	private static final String TITLE_EXER = "Ordem crescente";

	public static void main(String[] args) {

		int valueA = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor A:", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
		int valueB = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor B:", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));

		mostrarOrdemCrescente(valueA, valueB);
	}

	public static void mostrarOrdemCrescente(int valueA, int valueB) {

		String msgCrescente;

		if (valueB < valueA) msgCrescente = valueB + ", " + valueA;
		else msgCrescente = valueA + ", " + valueB;

		JOptionPane.showMessageDialog(null, "Ordem crescente -> (" + msgCrescente + ")", TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
	}
}
