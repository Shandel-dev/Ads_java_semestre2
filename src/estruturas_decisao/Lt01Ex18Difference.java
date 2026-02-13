package estruturas_decisao;

import javax.swing.JOptionPane;

public class Lt01Ex18Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, resul;
		String titleWindow = "Satoshi Exercicios";
		String operacao;
		
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor para A: ", titleWindow, JOptionPane.QUESTION_MESSAGE));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor para B: ", titleWindow, JOptionPane.QUESTION_MESSAGE));
		
		if(num1 > num2) {
			resul = num1 - num2;
			operacao = String.format("%d - %d = ", num1, num2);
			
		}else {
			resul = num2 - num1;
			operacao = String.format("%d - %d = ", num2, num1);
		}
		
		JOptionPane.showMessageDialog(null, operacao + resul, titleWindow, JOptionPane.INFORMATION_MESSAGE);
		
	}

}
