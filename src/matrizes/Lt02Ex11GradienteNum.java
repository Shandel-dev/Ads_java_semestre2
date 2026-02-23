package matrizes;

import javax.swing.JOptionPane;

public class Lt02Ex11GradienteNum {

	static final String TITLE_EXER = "Gradiente de números";
	static final int MATRIZ_SIZE = 26;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[MATRIZ_SIZE][MATRIZ_SIZE];
		loadMatriz(matriz);
		String msgTable = showMatriz(matriz);
		
		JOptionPane.showMessageDialog(null, msgTable, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public static void loadMatriz(int[][] matriz) {
		
		for(int count = 0; count <= matriz.length / 2; count++) {
			for(int row = 0 + count; row < matriz.length - count; row++) {
				for(int col = 0 + count; col < matriz[row].length - count; col++) {
					matriz[row][col]++;
				}
			}			
		}
		
	}
	
	public static String showMatriz(int[][] matriz) {
		StringBuilder formattedMatriz = new StringBuilder("Matriz[" + MATRIZ_SIZE + "][" + MATRIZ_SIZE + "] gerada:\n");
		
		for(int row = 0; row < matriz.length;row++) {
			for(int col = 0; col < matriz[row].length; col++) {
				formattedMatriz.append(String.format("%02d | ", matriz[row][col]));
			}
			formattedMatriz.append("\n");
		}
		return formattedMatriz.toString();
	}

}
