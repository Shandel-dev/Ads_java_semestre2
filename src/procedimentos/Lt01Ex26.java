package procedimentos;

import javax.swing.JOptionPane;

public class Lt01Ex26 {

	private static final String TITLE_EXER = "É múltiplo?";

	public static void main(String[] args) {

		int valueA = Integer.parseInt(JOptionPane.showInputDialog(null, "1° valor:", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
		int valueB = Integer.parseInt(JOptionPane.showInputDialog(null, "2° valor:", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));

		verificarMultiplo(valueA, valueB);
	}

	public static void verificarMultiplo(int valueA, int valueB) {

		if (valueB == 0) {
			JOptionPane.showMessageDialog(null, "Divisão por zero não é permitida!", TITLE_EXER, JOptionPane.ERROR_MESSAGE);
			return;
		}

		boolean isMultiple = valueA % valueB == 0;

		String msgResul = String.format("%d %sé múltiplo de %d!", valueA, isMultiple ? "" : "não ", valueB);

		JOptionPane.showMessageDialog(null, msgResul, TITLE_EXER, isMultiple ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.WARNING_MESSAGE);
	}
}
