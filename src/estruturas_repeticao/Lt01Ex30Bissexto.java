package estruturas_repeticao;

import javax.swing.JOptionPane;

public class Lt01Ex30Bissexto {

	public static void main(String[] args) {

		String titleExer = "Idade considerando bissexto";
		int diaNasc, mesNasc, anoNasc, diaAtual, mesAtual, anoAtual, idade = 0;

		diaNasc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o dia de nascimento:", titleExer,
				JOptionPane.QUESTION_MESSAGE));

		mesNasc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o mês de nascimento:", titleExer,
				JOptionPane.QUESTION_MESSAGE));

		anoNasc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de nascimento:", titleExer,
				JOptionPane.QUESTION_MESSAGE));

		diaAtual = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite o dia atual:", titleExer, JOptionPane.QUESTION_MESSAGE));

		mesAtual = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite o mês atual:", titleExer, JOptionPane.QUESTION_MESSAGE));

		anoAtual = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite o ano atual:", titleExer, JOptionPane.QUESTION_MESSAGE));

		
		int anos = 0;
		int meses = 0;
		int dias = 0;

		//LOGICA AINDA A SER FORMULADA
		
		
		String msgResul = String.format("Data de nascimento: %d/%d/%d%nData Atual: %d/%d/%d%nIdade -> %d anos, %d meses e %d dias!", diaNasc, mesNasc, anoNasc, diaAtual, mesAtual, anoAtual, anos, meses, dias);
		JOptionPane.showMessageDialog(null, msgResul, titleExer, JOptionPane.INFORMATION_MESSAGE);

	}
}
