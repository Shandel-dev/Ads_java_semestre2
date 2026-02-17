package vetores;

import java.security.SecureRandom;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Lt02Ex05Formula {

	static final String TITLE_EXER = "Calcular expressão matemática";
	static final int LIST_SIZE = 15;
	static final int MAX_VALUE = 75;
	static StringBuilder calcReport = new StringBuilder("Resultado = ");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] randomValues = new int[LIST_SIZE];
		
		loadList(randomValues);
		int resultCalc = calculate(randomValues);
		
		String msgUser = String.format(
							"Lista = %s%nNum de elementos da lista = %d%n%n%s%nResultado da expressão: %d", 
							Arrays.toString(randomValues), randomValues.length, calcReport, resultCalc
						);
		
		JOptionPane.showMessageDialog(null, msgUser, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void loadList(int[] list) {
		SecureRandom random = new SecureRandom();
		for(int i = 0; i < list.length; i++) {
			list[i] = random.nextInt(MAX_VALUE);
		}
	}
	
	public static int calculate(int[] list) {
		int result = 0;
		for(int s = 0; s < 3; s++) calcReport.append(String.format("(vet[%d] - vet[%d]) + ", s, list.length - 1 - s));
		calcReport.append("... (vet[i] - vet[" + list.length  + " - i])\nRelatório de somas:\n");
		
		//calculo a metade da lista
		int halfSize = list.length / 2;
		if(list.length % 2 != 0) halfSize++;
		
		for(int i = 1; i <= halfSize; i++) {			
			int sum = list[i - 1] - list[list.length - i];
			result += sum;
			calcReport.append(
					String.format(
							"%2d. (%d - %d) = %d | resul = %d%n",
							i, list[i - 1], list[list.length - i], sum, result
					)
			);
		}
		
		return result;
	}

}
