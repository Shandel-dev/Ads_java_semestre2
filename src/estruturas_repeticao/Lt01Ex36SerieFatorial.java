package estruturas_repeticao;

import javax.swing.JOptionPane;

public class Lt01Ex36SerieFatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		double resul = 0.0;
		String titleExer = "Sequencia com fatorial", msgSequence = "";
		
		num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o limite da sequencia", titleExer, JOptionPane.QUESTION_MESSAGE));
		
		for(int curr = 0; curr <= num; curr++) {
			//calcula fatorial
			int fatorial = 1;			
			for(int i = 1; i <= curr; i++) fatorial *= i;
			
			resul += 1.0 / fatorial;
			
			msgSequence = msgSequence.concat(
					String.format("1/%d! %s", curr, (curr != num) ? "+ " : "")
			);
			if(curr % 10 == 0 && curr != 0) msgSequence = msgSequence.concat("\n");
		}
		
		String msgResul = String.format("<Sequencia>%n%s%nResultado: %.2f", msgSequence, resul);
		JOptionPane.showMessageDialog(null, msgResul, titleExer, JOptionPane.INFORMATION_MESSAGE);
	}

}
