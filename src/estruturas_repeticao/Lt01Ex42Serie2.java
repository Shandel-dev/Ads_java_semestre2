package estruturas_repeticao;

import javax.swing.JOptionPane;

public class Lt01Ex42Serie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String TITLE_EXER = "Série 2", msgResul = "";
		int divisor = 1;
		double resul = 0.0;
		
		for(int dividendo = 1; dividendo <= 50; dividendo++) {
			msgResul = msgResul.concat(String.format("%d/%d %s", dividendo, divisor, (dividendo != 50) ? "+ " : ""));
			if(dividendo % 5 == 0) msgResul = msgResul.concat("\n");
			resul += (double)dividendo / (double)divisor;
			
			divisor += 2;
		}
		
		String msgUser = String.format("<SEQUENCIA>%n%s%nResultado: %.2f", msgResul, resul);
		JOptionPane.showMessageDialog(null, msgUser, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
	}

}
