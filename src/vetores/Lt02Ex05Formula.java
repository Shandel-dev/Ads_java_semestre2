package vetores;

import java.security.SecureRandom;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Lt02Ex05Formula {

	static final String TITLE_EXER = "Calcular expressão matemática";
	static final int LIST_SIZE = 53;
	static final int MAX_VALUE = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder calcReport = new StringBuilder("Resultado = ");
		int[] randomValues = new int[LIST_SIZE];
		
		loadList(randomValues);
		int resultCalc = calculate(randomValues, calcReport);
		
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
	
	public static int calculate(int[] list, StringBuilder report) {
		int result = 0;
		
		//contrução inicial de relatório
		for(int s = 0; s < 3; s++) report.append(String.format("(vet[%d] - vet[%d]) + ", s, list.length - 1 - s));
		report.append("... (vet[i] - vet[" + (list.length - 1)  + " - i])\nRelatório de somas:\n");
		
		//calculo a metade da lista
		int halfSize = list.length / 2;
		if(list.length % 2 != 0) halfSize++;
		
		for(int i = 1; i <= halfSize; i++) {			
			int sum = list[i - 1] - list[list.length - i];
			result += sum;
			
			//Cada operação é registrada no relatorio
			report.append(
					String.format(
							"%2d. (%d - %d) = %d | resul = %d%n",
							i, list[i - 1], list[list.length - i], sum, result
					)
			);
		}
		
		return result;
	}
	

}
