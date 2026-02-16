package estruturas_repeticao;

import javax.swing.JOptionPane;

public class Lt01Ex44Potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base, expoente, resul = 1;
		String TITLE_EXER = "Potência";
		
		base = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a base: ", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
		expoente = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a potência: ", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
		
		if(expoente < 1) resul = 1;
		else {
			for(int i = 1; i <= expoente; i++) {
				resul *= base;
			}			
		}
		
		String msgUser = String.format("%d elevado a %d é igual a %d", base, expoente, resul);
		JOptionPane.showMessageDialog(null, msgUser, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
	}

}
