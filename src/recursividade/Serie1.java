package recursividade;

import javax.swing.JOptionPane;

public class Serie1 {

	static String msgSequencia = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resul = calcSerie(100);
		
		JOptionPane.showMessageDialog(null, msgSequencia, "Serie1", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, resul);
	}
	
	public static int calcSerie(int value) {
		msgSequencia = String.format("%2d%s%s%s", value, (value != 100) ? "+" : "", (value % 10 == 0) ? "\n" : "", msgSequencia);
		
		if(value == 1) return 1;
		return value + calcSerie(value - 1);
	}
	

}
