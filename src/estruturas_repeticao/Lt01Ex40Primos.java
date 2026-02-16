package estruturas_repeticao;

import javax.swing.JOptionPane;

public class Lt01Ex40Primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valueA, valueB;
		boolean ehPrimo = true;
		String TITLE_EXER = "Números Primos";
		String sequence_primos = "";

		valueA = Integer
				.parseInt(JOptionPane.showInputDialog(null, "1° valor: ", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));
		valueB = Integer
				.parseInt(JOptionPane.showInputDialog(null, "2° valor: ", TITLE_EXER, JOptionPane.QUESTION_MESSAGE));

		if (valueB < valueA) {
			int aux = valueA;
			valueA = valueB;
			valueB = aux;
		}

		for (int curr = valueA; curr <= valueB; curr++) {
			if (curr <= 1) {
				ehPrimo = false;
			} else if (curr == 2) {
				ehPrimo = true;
			} else if (curr % 2 == 0) {
				ehPrimo = false;
			} else {
				for (int i = 3; i * i <= curr; i += 2) {
					if (curr % i == 0) {
						ehPrimo = false;
						break;
					}
				}
			}

			if (ehPrimo) {
				sequence_primos = sequence_primos.concat(String.format("%d %s", curr, "- "));
			}
			ehPrimo = true;
		}

		String msgUser = String.format("<Sequencia de primos entre %d e %d>%n%s", valueA, valueB, sequence_primos);

		JOptionPane.showMessageDialog(null, msgUser, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
	}
}
