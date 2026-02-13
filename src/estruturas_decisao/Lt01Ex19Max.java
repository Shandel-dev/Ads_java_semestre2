package estruturas_decisao;

import javax.swing.JOptionPane;

public class Lt01Ex19Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numMax, numAux;
		String title = "Satoshi - Java";
		
		numMax = Integer.parseInt(JOptionPane.showInputDialog(null, "1° value: ", title, JOptionPane.QUESTION_MESSAGE));
		
		numAux = Integer.parseInt(JOptionPane.showInputDialog(null, "2° value: ", title, JOptionPane.QUESTION_MESSAGE));
		
		if(numAux > numMax) numMax = numAux;
		
		JOptionPane.showMessageDialog(null, "O maior número digitado é " + numMax, title, JOptionPane.INFORMATION_MESSAGE);
	}

}
