package matrizes;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Lt02Ex12XadrezCode {
	static final String TITLE_EXER = "Xadrez - código de peças";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] xadrez = new int[8][8];
		loadProducts(xadrez);
		String msgXadrez = showMatriz(xadrez);
		StringBuilder msgPieces = new StringBuilder("Qt | Peça\n");
		
		int[] piecesNumber = countPieces(xadrez);
		String[] piecesName = {"Peão", "Torre", "Bispo", "Cavalo", "Rainha", "Rei", "Vazio"};
		
		for(int i = 0; i < piecesNumber.length; i++) {
			msgPieces.append(String.format("%02d | %s%n", piecesNumber[i], piecesName[i]));
		}
		JOptionPane.showMessageDialog(null, msgXadrez, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);		
		JOptionPane.showMessageDialog(null, msgPieces, TITLE_EXER, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void loadProducts(int[][] matriz) {
		int[] mainPieces = {2, 4, 3, 5, 6, 3, 4, 2};
		int[] pawnPieces = {1, 1, 1, 1, 1, 1, 1, 1};
		
		matriz[0] = Arrays.copyOf(mainPieces, matriz.length);
		matriz[1] = Arrays.copyOf(pawnPieces, matriz.length);
		
		for(int row = 2; row < 6; row++) {
			for(int col = 0; col < matriz[row].length; col++) {
				matriz[row][col] = 7;
			}
		}
		
		matriz[6] = Arrays.copyOf(pawnPieces, matriz.length);
		matriz[7] = Arrays.copyOf(mainPieces, matriz.length);
	}

	public static String showMatriz(int[][] matriz) {
		StringBuilder formattedMatriz = new StringBuilder("Tabuleiro de xadrez: \n");
		
		for(int row = 0; row < matriz.length;row++) {
			for(int col = 0; col < matriz[row].length; col++) {
				formattedMatriz.append(String.format("%02d | ", matriz[row][col]));
			}
			formattedMatriz.append("\n");
		}
		return formattedMatriz.toString();
	}
	
	public static int[] countPieces(int[][] matriz) {
		int[] pieces = new int[7];
		
		for(int row = 0; row < matriz.length;row++) {
			for(int col = 0; col < matriz[row].length; col++) {
				pieces[matriz[row][col] - 1]++;
			}
		}
		
		return pieces;
	}
}
