package estruturas_decisao;

import javax.swing.JOptionPane;

public class Lt01Ex26Multiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valueA, valueB;
		boolean isMultiple = false;
		String titleExer = "É múltiplo?";
		
		valueA = Integer.parseInt(JOptionPane.showInputDialog(null, "1° valor: ", titleExer, JOptionPane.QUESTION_MESSAGE));
		valueB = Integer.parseInt(JOptionPane.showInputDialog(null, "2° valor: ", titleExer, JOptionPane.QUESTION_MESSAGE));
		
		if(valueA % valueB == 0) isMultiple = true;
		
		String msgResul = String.format("%d %sé múltiplo de %d!", valueA, (isMultiple) ? "" : "não", valueB);
		JOptionPane.showMessageDialog(null, msgResul, titleExer, (isMultiple) ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.WARNING_MESSAGE);
	}

}
