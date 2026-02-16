package procedimentos;

import javax.swing.JOptionPane;

public class Lt01Ex21 {

	private static final String TITLE_EXER = "Notas Bimestrais";

	public static void main(String[] args) {

		double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "1° nota", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "2° nota", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "3° nota", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
		double n4 = Double.parseDouble(JOptionPane.showInputDialog(null, "4° nota", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));

		calcularMedia(n1, n2, n3, n4);
	}

	public static void calcularMedia(double n1, double n2, double n3, double n4) {

		double media = (n1 + n2 + n3 + n4) / 4;
		String msg;

		if (media == 6) msg = "APROVADO";
		else if (media >= 3) msg = "EXAME";
		else msg = "REPROVADO";

		JOptionPane.showMessageDialog(null, String.format("Média: %.2f%n%s!", media, msg), TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
	}
}
