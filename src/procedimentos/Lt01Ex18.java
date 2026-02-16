package procedimentos;

import javax.swing.JOptionPane;

public class Lt01Ex18 {

	public static void main(String[] args) {

		String titleWindow = "Satoshi Exercicios";

		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor para A:", titleWindow, JOptionPane.QUESTION_MESSAGE));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor para B:", titleWindow, JOptionPane.QUESTION_MESSAGE));

		calcularDiferenca(num1, num2, titleWindow);
	}

	public static void calcularDiferenca(int num1, int num2, String titleWindow) {
		int resultado;
		String operacao;

		if (num1 > num2) {
			resultado = num1 - num2;
			operacao = String.format("%d - %d = ", num1, num2);
		} else {
			resultado = num2 - num1;
			operacao = String.format("%d - %d = ", num2, num1);
		}

		JOptionPane.showMessageDialog(null, operacao + resultado, titleWindow, JOptionPane.INFORMATION_MESSAGE);
	}
}
