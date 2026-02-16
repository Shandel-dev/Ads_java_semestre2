package procedimentos;

import javax.swing.JOptionPane;

public class Lt01Ex19 {

	public static void main(String[] args) {

		String title = "Satoshi - Java";

		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "1° value:", title, JOptionPane.QUESTION_MESSAGE));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "2° value:", title, JOptionPane.QUESTION_MESSAGE));

		mostrarMaior(num1, num2, title);
	}

	public static void mostrarMaior(int num1, int num2, String title) {
		int numMax = num1;

		if (num2 > numMax) {
			numMax = num2;
		}

		JOptionPane.showMessageDialog(null, "O maior número digitado é " + numMax, title, JOptionPane.INFORMATION_MESSAGE);
	}
}
