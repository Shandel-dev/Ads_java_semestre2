package estruturas_decisao;

import javax.swing.JOptionPane;

public class Lt01Ex22Ordem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valueA, valueB;
		String titleExe = "Ordem crescente", msgCrescente;
		
		valueA = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor A: ", titleExe, JOptionPane.QUESTION_MESSAGE));
		valueB = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor B: ", titleExe, JOptionPane.QUESTION_MESSAGE));
		
		msgCrescente = valueA + ", " + valueB;
		if(valueB < valueA) msgCrescente = valueB + ", " + valueA;
		
		JOptionPane.showInputDialog(null, "Ordem crescente -> (" + msgCrescente + ")", titleExe, JOptionPane.INFORMATION_MESSAGE);
		
	}

}
