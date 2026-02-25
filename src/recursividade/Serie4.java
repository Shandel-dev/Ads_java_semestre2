package recursividade;

import javax.swing.JOptionPane;

public class Serie4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double resul = calcSerie(6, 1);

		JOptionPane.showMessageDialog(null, "Resultado: " + resul, "Serie 2", JOptionPane.INFORMATION_MESSAGE);

	}

	//(N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N)
	public static double calcSerie(int dividendo, int divisor) {
		if(dividendo == 1) return 1.0 / divisor;
		
		return (double) dividendo / divisor + calcSerie(dividendo - 1, divisor + 1);
	}

}
