package recursividade;

import javax.swing.JOptionPane;

public class Serie2 {

	String msgSequencia = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resul = calcSerie(10);
		
		JOptionPane.showMessageDialog(null, "Resultado: " + resul, "Serie 2", JOptionPane.INFORMATION_MESSAGE);
	}
	
	//Serie2 = (N) + (N-1) + (N-2) + ... + (1) 
	public static int calcSerie(int num) {
		if(num == 1) return 1;
		return num + calcSerie(num - 1);
	}

}
