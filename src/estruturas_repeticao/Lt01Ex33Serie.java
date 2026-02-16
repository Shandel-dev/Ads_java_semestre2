package estruturas_repeticao;

import javax.swing.JOptionPane;

public class Lt01Ex33Serie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numLimit;
		double resul = 0.0;
		String msgSequence = "", titleExer = "Sequência de números";
		
		do {
			numLimit = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o limite da série (entre 1 e 100): "));			
			if(!(numLimit >= 1 && numLimit <= 100)) JOptionPane.showMessageDialog(null, "Entrada de dado fora dos limites!\nPor favor, insira um número entre 1 e 100 (inclusive)", titleExer, JOptionPane.ERROR_MESSAGE);
		}while(!(numLimit >= 1 && numLimit <= 100));
		
		
		for(int numCur = 1; numCur <= numLimit; numCur++) {
			resul += (1.0/numCur);
			msgSequence = msgSequence.concat(
					String.format("1/%d %s", numCur, (numCur != numLimit) ? "+ " : "")
			);
			
			if(numCur % 10 == 0) msgSequence = msgSequence.concat("\n");
		}
		
		String msgResul = String.format("<Sequência>%n%s%nResultado: %.2f", msgSequence, resul);
		JOptionPane.showMessageDialog(null, msgResul, titleExer, JOptionPane.INFORMATION_MESSAGE);
		
	}

}
