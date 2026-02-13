package estruturas_decisao;

import javax.swing.JOptionPane;

public class Lt01Ex24Divisivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		boolean isDivided = false;
		
		String titleExer = "É divisível por 2 e 3?";
		
		num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ", titleExer, JOptionPane.QUESTION_MESSAGE));
		
		if(num % 2 == 0 && num % 3 == 0) isDivided = true;
		
		String msgResul = String.format("%d %sé divisível por 2 e 3!", num, (isDivided) ? "" : "não ");
		JOptionPane.showMessageDialog(null, 
				msgResul,
				titleExer,
				(isDivided) ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.WARNING_MESSAGE
		);
		
	}

}
