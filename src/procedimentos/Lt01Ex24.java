package procedimentos;

import javax.swing.JOptionPane;

public class Lt01Ex24 {

	private static final String TITLE_EXER = "É divisível por 2 e 3?";

	public static void main(String[] args) {

		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));

		verificarDivisibilidade(num);
	}

	public static void verificarDivisibilidade(int num) {

		boolean isDivided = false;

		if (num % 2 == 0 && num % 3 == 0)
			isDivided = true;

		String msgResul = String.format("%d %sé divisível por 2 e 3!", num, isDivided ? "" : "não ");

		JOptionPane.showMessageDialog(null, msgResul, TITLE_EXER, isDivided ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.WARNING_MESSAGE);
	}
}
