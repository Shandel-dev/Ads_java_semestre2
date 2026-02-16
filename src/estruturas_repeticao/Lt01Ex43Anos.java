package estruturas_repeticao;

import javax.swing.JOptionPane;

public class Lt01Ex43Anos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double anaAltura = 1.1, mariaAltura = 1.5;
		int anos = 0;
		String TITLE_EXER = "Ana e Maria";
		
		while(anaAltura < mariaAltura) {
			anaAltura += 0.03;
			mariaAltura += 0.02;
			if(anaAltura > mariaAltura) JOptionPane.showMessageDialog(null, String.format("Altura de Ana: %.2f%nAltura de Maria: %.2f%nDemorou %d anos para que Ana seja mais alta que Maria", anaAltura, mariaAltura, anos), TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
			else anos++;
		}
	}

}
