package estruturas_repeticao;

import javax.swing.JOptionPane;

public class Lt01Ex45Serie3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String TITLE_EXER = "Serie 3", sequence = "";
		double resul = 0;
		int divisor;
		
		for(int dividendo = 1; dividendo <= 15; dividendo++) {
			divisor = dividendo *dividendo;
			resul += (double)dividendo / (double)divisor;
			sequence = sequence.concat(String.format("%d/%d %s", dividendo, divisor, (dividendo != 15) ? "+ " : ""));
			if(dividendo % 5 == 0) sequence = sequence.concat("\n");
		}
		
		String msgUser = String.format("<Sequencia>%n%s%nResultado: %.2f", sequence, resul);
		JOptionPane.showMessageDialog(null, msgUser, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
	}

}
