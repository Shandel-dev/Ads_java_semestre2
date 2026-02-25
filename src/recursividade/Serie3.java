package recursividade;

import javax.swing.JOptionPane;

public class Serie3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double resul = calcSerie(20);
		
		JOptionPane.showMessageDialog(null, "Resultado: " + resul, "Serie 2", JOptionPane.INFORMATION_MESSAGE);

	}
	//3) Serie3 = (1/1) + (1/2) + (1/3) + ....+ (1/N) 
	public static double calcSerie(double target) {
		if(target == 1) return 1;
		
		return (1.0 / target) + calcSerie(target - 1);
	}

}
