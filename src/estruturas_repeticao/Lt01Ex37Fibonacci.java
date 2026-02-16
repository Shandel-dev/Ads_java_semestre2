package estruturas_repeticao;

import javax.swing.JOptionPane;

public class Lt01Ex37Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numTarget, penul = 0, ulti = 1, aux;
		
		String titleExer = "Série de Fibonnaci", sequenceNumbers = "";
		numTarget = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tamanho da série que deseja: ", titleExer, JOptionPane.QUESTION_MESSAGE));
		
		for(int n = 1; n <= numTarget; n++) {
			sequenceNumbers = sequenceNumbers.concat(
					String.format("%d %s", penul, (n != numTarget) ? "- " : "")
			);
			aux = ulti;
			ulti += penul;
			penul = aux;
		}
		
		String msgResul = String.format("<%d elementos>%n%s", numTarget, sequenceNumbers);
		JOptionPane.showMessageDialog(null, msgResul, titleExer, JOptionPane.INFORMATION_MESSAGE);
	}
	

}
