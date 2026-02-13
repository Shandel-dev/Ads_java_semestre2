package estruturas_decisao;

import javax.swing.JOptionPane;

public class Lt01Ex25Horas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hi, mi, hf, mf, inicioTotal, fimTotal, duracao, hourGame, minuteGame;
		final int HMAX = 23, MMAX = 59;
		

		String titleExer = "Coleta de Horário";

		hi = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Hora inicial (0-23):", titleExer, JOptionPane.QUESTION_MESSAGE));

		mi = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Minuto inicial (0-59):", titleExer, JOptionPane.QUESTION_MESSAGE));

		hf = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Hora final (0-23):", titleExer, JOptionPane.QUESTION_MESSAGE));

		mf = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Minuto final (0-59):", titleExer, JOptionPane.QUESTION_MESSAGE));
		
		//caso uma das extrada estiver fora do intervalo, uma mensagem de erro é exibida
		if(
				hi < 0 || hi > HMAX ||
				mi < 0 || mi > MMAX ||
			    hf < 0 || hf > HMAX ||
			    mf < 0 || mf > MMAX) {
			
			JOptionPane.showMessageDialog(null, "Entrada de dados fora do intervalo estipulado!", titleExer, JOptionPane.ERROR_MESSAGE);
		}else {			
			inicioTotal = hi * 60 + mi;
			fimTotal = hf * 60 + mf;

			//se passou de meia noite
			if(fimTotal < inicioTotal) fimTotal += 24 * 60;
			
			duracao = fimTotal - inicioTotal;
			
			hourGame = duracao / 60;
			minuteGame = duracao % 60;
			
			String msgResul = String.format("Duração do jogo | %dh:%dm", hourGame, minuteGame);
			JOptionPane.showMessageDialog(null, msgResul, titleExer, JOptionPane.INFORMATION_MESSAGE);
		}
		
		
		
		
			
	}

}
