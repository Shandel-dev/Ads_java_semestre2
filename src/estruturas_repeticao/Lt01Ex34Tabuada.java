package estruturas_repeticao;

import javax.swing.JOptionPane;

public class Lt01Ex34Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		String titleExer = "Tabuada", tableMulti;
		
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual tabuada deseja gerar? (entre 1 e 100):", titleExer, JOptionPane.QUESTION_MESSAGE));
			if(!(num >= 1 && num <= 100)) JOptionPane.showMessageDialog(null, "Insira um valor no intervalo estabelecido!", titleExer, JOptionPane.ERROR_MESSAGE);
		}while(!(num >= 1 && num <= 100));
		
		
		tableMulti = "Tabuada do " + num + ":";
		
		for(int curr = 0; curr <= 10; curr++) tableMulti = tableMulti.concat(String.format("%d x %d = %d%n", num, curr, num * curr));
		
		JOptionPane.showMessageDialog(null, tableMulti, titleExer, JOptionPane.INFORMATION_MESSAGE);
	}

}
