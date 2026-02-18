package matrizes;

import java.security.SecureRandom;

import javax.swing.JOptionPane;

public class Lt02Ex09Diagonal {

	static final String TITLE_EXER = "Preencher diagonal";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[4][4];	
		
		loadMatriz(matriz);
		String msgTable = showMatriz(matriz);
		String[] options = {"Gerar nova matriz", "Sair"};
		int op = 0;
		
		do {			
			op = JOptionPane.showOptionDialog(null, msgTable, TITLE_EXER, JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			
			switch (op) {
			case 0:
				loadMatriz(matriz);
				msgTable = showMatriz(matriz);
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "Encerrando programa...", TITLE_EXER, JOptionPane.WARNING_MESSAGE);
				break;
			default:
				op = 1;
				break;
			}
		}while(op != 1);
	}
	
	public static String showMatriz(int[][] matriz) {
		StringBuilder formattedMatriz = new StringBuilder("Matriz gerada:\n");
		
		for(int row = 0; row < matriz.length;row++) {
			for(int col = 0; col < matriz[row].length; col++) {
				formattedMatriz.append(String.format("%02d | ", matriz[row][col]));
			}
			formattedMatriz.append("\n");
		}
		return formattedMatriz.toString();
	}
	
	public static void loadMatriz(int[][] matriz) {
		SecureRandom random = new SecureRandom();
		
		for(int row = 0; row < matriz.length;row++) {
			for(int col = 0; col < matriz[row].length; col++) {
				int numGen;
				if(row == col) numGen = (int)Math.pow(4, row);
				else numGen = random.nextInt(100);
				matriz[row][col] = numGen;
			}
		}
	}

}
