package procedimentos;

import javax.swing.JOptionPane;

public class Lt01Ex27 {

	private static final String TITLE_EXER = "Cálculo de velocidade média!";

	public static void main(String[] args) {

		int voltas = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número de voltas:", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
		int extensaoMetros = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a extensão do circuito (em metros):", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
		int tempoMinutos = Integer.parseInt(JOptionPane.showInputDialog(null, "Tempo de duração da corrida (em minutos):", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));

		calcularVelocidadeMedia(voltas, extensaoMetros, tempoMinutos);
	}

	public static void calcularVelocidadeMedia(int voltas, int extensaoMetros, int tempoMinutos) {

		if (tempoMinutos <= 0) {
			JOptionPane.showMessageDialog(null, "Tempo deve ser maior que zero!", TITLE_EXER, JOptionPane.ERROR_MESSAGE);
			return;
		}

		double veloMedia = ((extensaoMetros / 1000.0) * voltas) / (tempoMinutos / 60.0);

		String msgResul = String.format("Velocidade média: %.2f km/h", veloMedia);

		JOptionPane.showMessageDialog(null, msgResul, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
	}
}
