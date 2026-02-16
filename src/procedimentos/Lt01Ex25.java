package procedimentos;

import javax.swing.JOptionPane;

public class Lt01Ex25{

	private static final String TITLE_EXER = "Coleta de Horário";
	private static final int HMAX = 23;
	private static final int MMAX = 59;

	public static void main(String[] args) {

		int hi = Integer.parseInt(JOptionPane.showInputDialog(null, "Hora inicial (0-23):", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
		int mi = Integer.parseInt(JOptionPane.showInputDialog(null, "Minuto inicial (0-59):", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
		int hf = Integer.parseInt(JOptionPane.showInputDialog(null, "Hora final (0-23):", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
		int mf = Integer.parseInt(JOptionPane.showInputDialog(null, "Minuto final (0-59):", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));

		calcularDuracao(hi, mi, hf, mf);
	}

	public static void calcularDuracao(int hi, int mi, int hf, int mf) {

		if (hi < 0 || hi > HMAX || mi < 0 || mi > MMAX || hf < 0 || hf > HMAX || mf < 0 || mf > MMAX) {
			JOptionPane.showMessageDialog(null, "Entrada de dados fora do intervalo estipulado!", TITLE_EXER, JOptionPane.ERROR_MESSAGE);
			return;
		}

		int inicioTotal = hi * 60 + mi;
		int fimTotal = hf * 60 + mf;

		if (fimTotal < inicioTotal) fimTotal += 24 * 60;

		int duracao = fimTotal - inicioTotal;

		int hourGame = duracao / 60;
		int minuteGame = duracao % 60;

		String msgResul = String.format("Duração do jogo | %dh:%dm", hourGame, minuteGame);

		JOptionPane.showMessageDialog(null, msgResul, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
	}
}
