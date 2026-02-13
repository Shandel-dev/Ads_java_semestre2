package estruturas_decisao;

import javax.swing.JOptionPane;

public class Lt01Ex23Crescente4Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3, n4, aux;
		String titleExe = "Ordem Crescente de 4 números";
		
		//versao bruta - varificaçao a cada entrada
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "1° valor: ", titleExe, JOptionPane.QUESTION_MESSAGE));
		n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "2° valor: ", titleExe, JOptionPane.QUESTION_MESSAGE));
		
		if(n2 < n1) {
			aux = n1;
			n1 = n2;
			n2 = aux;
		}
		
		n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "3° valor: ", titleExe, JOptionPane.QUESTION_MESSAGE));
		
		if(n3 < n2) {
			aux = n2;
			n2 = n3;
			n3 = aux;
		}
		if(n2 < n1) {
			aux = n1;
			n1 = n2;
			n2 = aux;
		}
		
		
		n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "4° valor: ", titleExe, JOptionPane.QUESTION_MESSAGE));
		
		if(n4 < n3) {
			aux = n3;
			n3 = n4;
			n4 = n3;
		}
		
		if(n3 < n2) {
			aux = n2;
			n2 = n3;
			n3 = aux;
		}
		if(n2 < n1) {
			aux = n1;
			n1 = n2;
			n2 = aux;
		}
			
		JOptionPane.showMessageDialog(null, String.format("Ordem Crescente -> [%d, %d, %d, %d]", n1, n2, n3, n4), titleExe, JOptionPane.INFORMATION_MESSAGE);
	}

}
