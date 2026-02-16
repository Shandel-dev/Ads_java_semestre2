package estruturas_repeticao;

import javax.swing.JOptionPane;

public class Lt01Ex38MaiorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int QUANT_ENTRADA = 5;
		int numInput = 0;
		int numMax = 0, numMin = 0;
		String TITLE_EXER = "Maior e menor valor";
		
		for(int i = 1; i <= QUANT_ENTRADA; i++) {
			do {
				String msgInput = String.format("%d° valor: ", i);
				numInput = Integer.parseInt(JOptionPane.showInputDialog(null, msgInput, TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
				if(numInput < 0) JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", TITLE_EXER, JOptionPane.ERROR_MESSAGE);
			}while(numInput < 0);
			
			//inicializa as variaveis de maximo e minimo
			if(numMax == 0 && numMin == 0) {
				numMax = numInput;
				numMin = numInput;
			}
			
			if(numInput > numMax) numMax = numInput;
			if(numInput < numMin) numMin = numInput;
			
		}
		
		String msgResul = String.format("Valor máximo: %d%nValor mínimo: %d", numMax, numMin);
		
		JOptionPane.showMessageDialog(null, msgResul, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
	}

}
