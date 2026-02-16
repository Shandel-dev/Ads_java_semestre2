package estruturas_repeticao;

import javax.swing.JOptionPane;

public class Lt01Ex41Dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String TITLE_EXER = "Dois dados";
		String msgResul = "";
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if(i + j == 7) msgResul = msgResul.concat(String.format("D1: %d + D2: %d%n", i, j));
			}
		}
		
		String msgUser = String.format("Possibilidades de dados que somam 7%n%s",  msgResul);
		
		JOptionPane.showMessageDialog(null, msgUser, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
	}

}
