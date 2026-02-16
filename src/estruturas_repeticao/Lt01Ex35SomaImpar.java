package estruturas_repeticao;

import javax.swing.JOptionPane;

public class Lt01Ex35SomaImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int initNum, finalNum, aux, resul = 0;
		String titleExer = "Soma de ímpares";
		
		initNum = Integer.parseInt(JOptionPane.showInputDialog(null, "1° valor: ", titleExer, JOptionPane.QUESTION_MESSAGE));
		finalNum = Integer.parseInt(JOptionPane.showInputDialog(null, "2° valor", titleExer, JOptionPane.QUESTION_MESSAGE));
		
		if(initNum > finalNum) {
			aux = initNum;
			initNum = finalNum;
			finalNum = aux;
		}
		for(int num = initNum; num <= finalNum; num++) {
			if(num % 2 != 0) resul += num;
		}
		
		String msgResul = String.format("Resultado da soma dos números ímpares entre %d e %d -> %d", initNum, finalNum, resul);
		JOptionPane.showMessageDialog(null, msgResul, titleExer, JOptionPane.INFORMATION_MESSAGE);
		
	}

}
