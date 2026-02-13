
package estruturas_decisao;

import javax.swing.JOptionPane;

public class Lt01Ex23Crescente4Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d, aux;
		String titleExe = "Ordem Crescente de 4 números";

		// versao bruta - varificaçao a cada entrada

		a = Integer.parseInt(JOptionPane.showInputDialog(null, "1° valor: ", titleExe, JOptionPane.QUESTION_MESSAGE));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "2° valor: ", titleExe, JOptionPane.QUESTION_MESSAGE));
		c = Integer.parseInt(JOptionPane.showInputDialog(null, "3° valor: ", titleExe, JOptionPane.QUESTION_MESSAGE));
		d = Integer.parseInt(JOptionPane.showInputDialog(null, "4° valor: ", titleExe, JOptionPane.QUESTION_MESSAGE));

		if(a > b) {
			aux = a;
			a = b;
			b = aux;
		}
		if(a > c) {
			aux = a;
			a = c;
			c = aux;
		}
		if(a > d) {
			aux = a;
			a = d;
			d = aux;
		}
		
		if(b > c) {
			aux = b;
			b = c;
			c = aux;
		}
		if(b > d) {
			aux = b;
			b = d;
			d = aux;
		}
		
		if(c > d) {
			aux = c;
			c = d;
			d = aux;
		}
		
		String msgResul = String.format("Ordem Crescente -> [%d, %d, %d, %d]", a, b, c, d);
		
		JOptionPane.showMessageDialog(
				null,
				msgResul,
				titleExe,
				JOptionPane.INFORMATION_MESSAGE
		);
	}
}
