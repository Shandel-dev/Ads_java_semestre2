package recursividade;

import javax.swing.JOptionPane;

public class Serie5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resul = calcSerie(5);

		JOptionPane.showMessageDialog(null, "Resultado: " + resul, "Serie 2", JOptionPane.INFORMATION_MESSAGE);

	}

	// Serie5 = (N)! + (N-1)! + (N-2)! + ... + (1)!
	public static int calcSerie(int lenght) {
		if (lenght == 1)
			return 1;
		return factorial(lenght) + calcSerie(lenght - 1);
	}

	public static int factorial(int value) {
		if (value == 1)
			return 1;
		return value * factorial(value - 1);
	}

}
