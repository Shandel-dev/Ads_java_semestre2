package estruturas_repeticao;

import javax.swing.JOptionPane;

public class Lt01Ex32Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int fatorial = 1;
		
		String titleExer = "Fatorial de um número";
		
		num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
		
		for(int i = 1; i <= num; i++) fatorial *= i;
		
		JOptionPane.showMessageDialog(null, fatorial, titleExer, JOptionPane.INFORMATION_MESSAGE);
	}

}
