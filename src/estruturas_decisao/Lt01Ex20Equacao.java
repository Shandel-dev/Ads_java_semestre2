package estruturas_decisao;

import javax.swing.JOptionPane;

public class Lt01Ex20Equacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, delta;
		
		String titleExe = "Equação de 2° Grau", msgResul;
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Coeficiente A: ", titleExe, JOptionPane.QUESTION_MESSAGE));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Coeficiente B: ", titleExe, JOptionPane.QUESTION_MESSAGE));
		c = Integer.parseInt(JOptionPane.showInputDialog(null, "Coeficiente C: ", titleExe, JOptionPane.QUESTION_MESSAGE));
		
		delta = b * b - 4 * a * c;
		
		if(delta > 0) {
			int raiz1 = (int) ((-(b) + Math.sqrt(delta)) / 2*a);
			int raiz2 = (int) ((-(b) - Math.sqrt(delta)) / 2*a);
			
			msgResul = String.format(
					"Coeficientes: a = %d, b = %d, c = %d%nRaízes: (%d, %d)", 
					a, b, c, raiz1, raiz2
			);
		}else {
			msgResul = "Não existem duas raízes!";
		}
		
		JOptionPane.showMessageDialog(null, msgResul, titleExe, JOptionPane.INFORMATION_MESSAGE);
	}

}
